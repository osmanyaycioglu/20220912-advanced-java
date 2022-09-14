package org.training.advanced.properties;

import org.training.advanced.reflections.Property;

@Property(file = "app.properties",prefix = "app")
public class AppProperties {
    private Integer port;
    private String name;
    private String description;
    private String host;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "AppProperties{" +
                "port=" + port +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", host='" + host + '\'' +
                '}';
    }
}
