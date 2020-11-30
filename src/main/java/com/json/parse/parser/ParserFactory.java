package com.json.parse.parser;

public class ParserFactory {
    public static Parser getParser(String fileName){
        if(fileName.toUpperCase().endsWith("JSON")) {
            return new JSONParser(fileName);
        } else if (fileName.toUpperCase().endsWith("XML")) {
            return new XMLParser(fileName);
        } else {
            return null;
        }
    }
}
