package org.github.twohou.sonic;

import java.io.IOException;

import lombok.NonNull;

public class ChannelFactory {

    private String address;

    private Integer port;

    private String password;

    private Integer connectionTimeout;

    private Integer readTimeout;

    public ChannelFactory(@NonNull String address, @NonNull Integer port, @NonNull String password,
            @NonNull Integer connectionTimeout,
            @NonNull Integer readTimeout) {
        this.address = address;
        this.port = port;
        this.password = password;
        this.connectionTimeout = connectionTimeout;
        this.readTimeout = readTimeout;
    }

    public IngestChannel newIngestChannel() throws IOException {
        return new IngestChannel(
                this.address,
                this.port,
                this.password,
                this.connectionTimeout,
                this.readTimeout
        );
    }

    public SearchChannel newSearchChannel() throws IOException {
        return new SearchChannel(
                this.address,
                this.port,
                this.password,
                this.connectionTimeout,
                this.readTimeout
        );
    }

    public ControlChannel newControlChannel() throws IOException {
        return new ControlChannel(
                this.address,
                this.port,
                this.password,
                this.connectionTimeout,
                this.readTimeout
        );
    }
}
