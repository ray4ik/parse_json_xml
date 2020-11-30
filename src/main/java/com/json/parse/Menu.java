package com.json.parse;

import com.json.parse.parser.Parser;
import com.json.parse.parser.ParserFactory;
import com.json.parse.menu.MenuItem;

import java.io.IOException;
import java.util.List;

public class Menu {

    public static void main(String[] args) {

        String fileName = null;
        Boolean sortReverse = false;

        // get arguments

        if (args.length > 0) {
            fileName = args[0];

            if (args.length > 1) {
                sortReverse = "desc".equals(args[1]);
            }
        } else {
            System.out.println("Input format: java –jar menu.jar <fileName> [<sort>]");
            System.exit(1);
        }

        // get parser

        Parser parser = ParserFactory.getParser(fileName);

        if (parser == null) {
            System.out.println("Parser not found");
            System.exit(1);
        }

        // parse

        try {
            parser.parse();
        } catch (IOException e) {
            System.out.println("Can not read the file");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Can not parse the file");
            System.exit(1);
        }

        // print

        List<MenuItem> menu = parser.getMenu(sortReverse);
        menu.forEach(entry -> System.out.println(entry.toString()));
    }
}
