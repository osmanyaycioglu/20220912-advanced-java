package org.training.advanced.properties;

import org.training.advanced.reflections.PropertyEngine;

public class PropertEngineRead {
    public static void main(String[] args) {
        AppProperties appProperties = new AppProperties();
        PropertyEngine.readProperty(appProperties);
        System.out.println(appProperties);

        TestProperties testProperties = new TestProperties();
        PropertyEngine.readProperty(testProperties);
        System.out.println(testProperties);
    }
}
