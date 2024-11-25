package com.firstQuest.servlet;

import java.util.HashMap;

public class LogInChecking {
    String username;

    public boolean checkPasswordUndLogin(HashMap<String, String> hashMap, String login, String password) {
        boolean confirm = false;
        for (String s : hashMap.keySet()) {
            if (s.equals(login)) {
                if (hashMap.get(s).equals(password)) {
                    confirm = true;
                    Registration.username = s;
                    username=s;
                }
            }
        }
        return confirm;
    }

    public boolean checkingLogin(HashMap<String, String> hashMap, String login) {
        boolean confirm = false;
        for (String s : hashMap.keySet()) {
            if (s.equals(login)) {

                confirm = true;

            }
        }
        return confirm;
    }

    public String getUsername() {
        return username;
    }

}
