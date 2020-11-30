package com.json.parse.parser;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JSONParserTest {

    @Test
    void parseSuccess() throws Exception {
        String fileName = "src/test/resources/test_1.json";
        JSONParser parser = new JSONParser(fileName);
        parser.parse();
        assertEquals(2, parser.getMenu(false).size());
    }

    @Test
    void parseFileNotFound() {
        String fileName = "src/test/resources/test_not_found.json";
        JSONParser parser = new JSONParser(fileName);

        assertThrows(IOException.class, () -> {
            parser.parse();
        });
    }
}