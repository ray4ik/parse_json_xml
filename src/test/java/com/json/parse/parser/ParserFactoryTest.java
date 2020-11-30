package com.json.parse.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserFactoryTest {

    @Test
    void getParserXML() {
        Parser instance = ParserFactory.getParser("test.xml");
        assertTrue(instance instanceof XMLParser);
    }

    @Test
    void getParserXML2() {
        Parser instance = ParserFactory.getParser("test.Xml");
        assertTrue(instance instanceof XMLParser);
    }

    @Test
    void getParserJSON() {
        Parser instance = ParserFactory.getParser("test.json");
        assertTrue(instance instanceof JSONParser);
    }

    @Test
    void getParserJSON2() {
        Parser instance = ParserFactory.getParser("test.JsOn");
        assertTrue(instance instanceof JSONParser);
    }

    @Test
    void getParserUnknown() {
        Parser instance = ParserFactory.getParser("test.txt");
        assertNull(instance);
    }
}