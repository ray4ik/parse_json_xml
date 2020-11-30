package com.json.parse.parser;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class XMLParserTest {

    @Test
    void parseSuccess() throws Exception {
        String fileName = "src/test/resources/test_1.xml";
        XMLParser parser = new XMLParser(fileName);
        parser.parse();
        assertEquals(2, parser.getMenu(false).size());
    }

    @Test
    void parseFileNotFound() {
        String fileName = "src/test/resources/test_not_found.xml";
        XMLParser parser = new XMLParser(fileName);

        assertThrows(IOException.class, () -> {
            parser.parse();
        });
    }
}