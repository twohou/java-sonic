package org.github.twohou.sonic;

import java.io.IOException;

import lombok.NonNull;

public class IngestChannel extends Channel {
    public IngestChannel(@NonNull String address, @NonNull Integer port, @NonNull String password,
            @NonNull Integer connectionTimeout, @NonNull Integer readTimeout)
            throws IOException {
        super(address, port, password, connectionTimeout, readTimeout);
        this.start(Mode.ingest);
    }

    public void push(@NonNull String collection, @NonNull String bucket, @NonNull String object, @NonNull String text)
            throws IOException {
        this.send(String.format(
                "PUSH %s %s %s \"%s\"",
                collection,
                bucket,
                object,
                text
        ));
        this.assertOK();
    }

    public void pop(@NonNull String collection, @NonNull String bucket, @NonNull String object, @NonNull String text)
            throws IOException {
        this.send(String.format(
                "POP %s %s %s \"%s\"",
                collection,
                bucket,
                object,
                text
        ));
        this.assertOK();
    }

    public Integer count(@NonNull String collection, String bucket, String object) throws IOException {
        if (bucket == null && object != null) {
            throw new IllegalArgumentException("bucket is required for counting an object");
        }

        this.send(String.format(
                "COUNT %s%s%s",
                collection,
                bucket == null ? "" : " " + bucket,
                object == null ? "" : " " + object
        ));
        return this.assertResult();
    }

    public Integer count(@NonNull String collection, String bucket) throws IOException {
        return this.count(collection, bucket, null);
    }

    public Integer count(@NonNull String collection) throws IOException {
        return this.count(collection, null);
    }

    public Integer flushc(@NonNull String collection) throws IOException {
        this.send(String.format("FLUSHC %s", collection));
        return this.assertResult();
    }

    public Integer flushb(@NonNull String collection, @NonNull String bucket) throws IOException {
        this.send(String.format("FLUSHB %s %s", collection, bucket));
        return this.assertResult();
    }

    public Integer flusho(@NonNull String collection, @NonNull String bucket, @NonNull String object)
            throws IOException {
        this.send(String.format("FLUSHO %s %s %s", collection, bucket, object));
        return this.assertResult();
    }
}
