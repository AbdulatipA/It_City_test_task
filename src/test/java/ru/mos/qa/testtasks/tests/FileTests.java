package ru.mos.qa.testtasks.tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class FileTests {

    @Test
    public void testFile() throws IOException {
//        Path file = Path.of("D:\\1Programming\\JavaProjects\\QA\\testtasks-main\\src\\test\\resources\\TraineeCharacteristics.txt");
        Path file = Path.of("src/test/resources/TraineeCharacteristics.txt");
        String texts = Files.readString(file);
        List<String> listTexts = List.of(texts.split("\n"));

        for(String t : listTexts) {
            t.contains("Упорство");
            System.out.println(listTexts);
            break;
        };
    }
}
