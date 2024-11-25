package com.firstQuest.servlet;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Registration {

    String filePath = "c:/1/output.txt";
    public static String username;

    public HashMap<String, String> loginPass = new HashMap<>();

    public void savePassUndLog(String login, String pass) throws IOException {
        username = login;
        loginPass.put(login, pass);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, String> entry : loginPass.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
        }
    }

    public void readFileWithPasswordUndLogin() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    loginPass.put(key, value);
                }
            }
        }
    }
    public String getUsername() {
        return username;
    }
}

