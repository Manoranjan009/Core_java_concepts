package com.cglia.training.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileReadingUsingHashmap {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Lenovo\\Desktop\\emp_details.txt"; 

        Map<String, String> keyValueMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("-"); 
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    keyValueMap.put(key, value);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        for (Map.Entry<String, String> entry : keyValueMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
