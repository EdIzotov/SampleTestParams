package com.example;

import org.testng.annotations.Test;

import java.util.Map;

public class SampleTest {
    @Test
    public void testMethod() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("RUNNING...");
        Map<String, String> getenv = System.getenv();
        for (Map.Entry<String, String> entry: getenv.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
