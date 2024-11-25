package com.firstQuest.servlet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class RegistrationTest {

    private Registration registration;
    private String testFilePath = "c:/1/test_output.txt";

    @BeforeEach
    public void setUp() throws IOException {
        registration = new Registration();
        registration.filePath = testFilePath;
        Files.deleteIfExists(Path.of(testFilePath));
    }

    @Test
    public void testSavePassUndLog() throws IOException {
        registration.savePassUndLog("testUser", "testPassword");

        File file = new File(testFilePath);
        assertTrue(file.exists(), "Файл має бути створений");

        String content = Files.readString(Path.of(testFilePath));
        assertTrue(content.contains("testUser:testPassword"), "Файл має містити збережені дані");
    }

    @Test
    public void testReadFileWithPasswordUndLogin() throws IOException {
        // Створення тестового файлу з даними
        Files.writeString(Path.of(testFilePath), "testUser:testPassword\n");

        registration.readFileWithPasswordUndLogin();

        assertEquals("testPassword", registration.loginPass.get("testUser"));
    }

    @Test
    public void testGetUsername() throws IOException {
        registration.savePassUndLog("testUser", "testPassword");

        assertEquals("testUser", registration.getUsername());
    }
}
