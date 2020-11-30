package com.json.parse.parser;

import com.github.cliftonlabs.json_simple.*;
import com.json.parse.menu.MenuItem;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONParser extends Parser {
    public JSONParser(String fileName) {
        super(fileName);
    }

    @Override
    public void parse() throws IOException, JsonException {
        Reader reader = Files.newBufferedReader(Paths.get(this.fileName));
        JsonObject parser = (JsonObject) Jsoner.deserialize(reader);

        JsonObject breakfastMenu = (JsonObject) parser.get("breakfast_menu");
        JsonArray food = (JsonArray) breakfastMenu.get("food");

        this.menu.clear();

        food.forEach(entry -> {
            JsonObject entryMenu = (JsonObject) entry;
            MenuItem menuItem = new MenuItem(
                (String) entryMenu.get("name"),
                (String) entryMenu.get("description"),
                (String) entryMenu.get("price"),
                (String) entryMenu.get("calories")
            );
            this.menu.add(menuItem);
        });

        reader.close();
    }
}
