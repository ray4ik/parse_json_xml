package com.json.parse.parser;

import com.json.parse.menu.MenuItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    private Parser getParser() throws Exception {
        String fileName = "src/test/resources/test_1.json";
        JSONParser parser = new JSONParser(fileName);
        parser.parse();
        return parser;
    }

    @Test
    void getMenu() throws Exception {
        MenuItem firstItem = getParser().getMenu(false).get(0);
        assertEquals("Test 1", firstItem.getName());
    }

    @Test
    void getMenuReversed() throws Exception {
        MenuItem firstItem = getParser().getMenu(true).get(0);
        assertEquals("Test 2", firstItem.getName());
    }
}