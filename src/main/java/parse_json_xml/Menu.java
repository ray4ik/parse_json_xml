/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package parse_json_xml;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {


        String fileName = "";
        String sortMethod = "";

        if (args.length == 2) {
            fileName = args[0];
            sortMethod = args[1];
        }
        else if (args.length == 1) {
            fileName = args[0];
            sortMethod = "asc";
        }
        else {
            System.out.println("no data, please input file name to be pasrced  and sort order (by default = asc) ");
        }
    }
}
