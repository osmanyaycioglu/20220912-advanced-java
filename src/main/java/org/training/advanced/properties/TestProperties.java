package org.training.advanced.properties;

import org.training.advanced.reflections.Property;

@Property(file = "test.properties",prefix = "test.prop")
public class TestProperties {
    private String ip;
    private String description;
    private String testName;
    private String testHost;
    private int testPort;
    private Integer deneme;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestHost() {
        return testHost;
    }

    public void setTestHost(String testHost) {
        this.testHost = testHost;
    }

    public int getTestPort() {
        return testPort;
    }

    public void setTestPort(int testPort) {
        this.testPort = testPort;
    }

    public Integer getDeneme() {
        return deneme;
    }

    public void setDeneme(Integer deneme) {
        this.deneme = deneme;
    }

    @Override
    public String toString() {
        return "TestProperties{" +
                "ip='" + ip + '\'' +
                ", description='" + description + '\'' +
                ", testName='" + testName + '\'' +
                ", testHost='" + testHost + '\'' +
                ", testPort=" + testPort +
                ", deneme=" + deneme +
                '}';
    }
}
