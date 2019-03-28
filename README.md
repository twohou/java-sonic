# java-sonic

[![Build Status](https://travis-ci.com/twohou/java-sonic.svg?branch=master)](https://travis-ci.com/twohou/java-sonic)

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
    implementation 'com.github.twohou:java-sonic:master-SNAPSHOT'
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
    <version>master-SNAPSHOT</version>
</dependency>
```

## Usage

See [example](./src/test/java/org/github/twohou/sonic/IntegrationTest.java)
