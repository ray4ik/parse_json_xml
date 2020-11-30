package com.json.parse.parser;

import com.json.parse.menu.MenuItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Parser {
    protected String fileName;
    protected List<MenuItem> menu;

    public Parser(String fileName) {
        this.fileName = fileName;
        this.menu = new ArrayList<>();
    }

    public abstract void parse() throws Exception;

    public List<MenuItem> getMenu(Boolean reversed) {
        Comparator<MenuItem> comparator = Comparator.comparing(MenuItem::getName);

        if (reversed) {
            comparator = comparator.reversed();
        }

        return this.menu.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
