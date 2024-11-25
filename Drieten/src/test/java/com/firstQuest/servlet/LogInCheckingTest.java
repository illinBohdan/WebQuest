package com.firstQuest.servlet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LogInCheckingTest {

    private LogInChecking logInChecking;
    private HashMap<String, String> loginPass;

    @BeforeEach
    public void setUp() {
        logInChecking = new LogInChecking();
        loginPass = new HashMap<>();
        loginPass.put("user1", "password1");
        loginPass.put("user2", "password2");
    }

    @Test
    public void testCheckPasswordUndLogin_Success() {
        boolean result = logInChecking.checkPasswordUndLogin(loginPass, "user1", "password1");
        assertTrue(result);
        assertEquals("user1", logInChecking.getUsername());
    }

    @Test
    public void testCheckPasswordUndLogin_Failure() {
        boolean result = logInChecking.checkPasswordUndLogin(loginPass, "user1", "wrongPassword");
        assertFalse(result);
    }

    @Test
    public void testCheckingLogin_Success() {
        boolean result = logInChecking.checkingLogin(loginPass, "user1");
        assertTrue(result);
    }

    @Test
    public void testCheckingLogin_Failure() {
        boolean result = logInChecking.checkingLogin(loginPass, "nonExistentUser");
        assertFalse(result);
    }

    @Test
    public void testGetUsername() {
        logInChecking.username = "testUser";
        assertEquals("testUser", logInChecking.getUsername());
    }
}
