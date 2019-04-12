# java-sonic

[![Release](https://jitpack.io/v/twohou/java-sonic.svg)](https://jitpack.io/#twohou/java-sonic)
[![Build Status](https://travis-ci.com/twohou/java-sonic.svg?branch=master)](https://travis-ci.com/twohou/java-sonic)

Java client library of [Sonic search](https://github.com/valeriansaliou/sonic/)

## Compatibility

Tested under Ubuntu Trusty with:

- oraclejdk8
- oraclejdk9
- oraclejdk11
- openjdk8
- openjdk9
- openjdk11
- openjdk12

## Install

### Gradle

Step 1. Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency
```groovy
dependencies {
    implementation 'com.github.twohou:java-sonic:1.0.1'
}
```

### Maven

Step 1. Add the JitPack repository to your build file

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Step 2. Add the dependency

```xml
<dependency>
    <groupId>com.github.twohou</groupId>
    <artifactId>java-sonic</artifactId>
    <version>1.0.1</version>
</dependency>
```

## Usage

See [example](./src/test/java/com/github/twohou/sonic/IntegrationTest.java)
