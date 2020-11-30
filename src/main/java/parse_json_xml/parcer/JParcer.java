package parse_json_xml.parcer;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.github.cliftonlabs.json_simple.JsonArray;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JParcer {
    //JSONObject jsonFile;
    String fileName;


    public JParcer(String fileName) {
        this.fileName = fileName;
    }

    public void parseFile() throws Exception {
        // create a
        Reader reader = null;
        reader = Files.newBufferedReader(Paths.get(fileName));


        JsonObject parser = null;
        // create parser
        if (reader != null) {

                parser = (JsonObject) Jsoner.deserialize(reader);

        }

        JsonObject breakfastMenu = (JsonObject) parser.get("breakfast_menu");
        JsonArray food = (JsonArray) breakfastMenu.get("food");
        food.forEach(entry -> {
            JsonObject project = (JsonObject) entry;
            System.out.println(project.get("name"));
            System.out.println(project.get("price"));
            System.out.println(project.get("description"));
            System.out.println(project.get("calories"));

        });

        reader.close();


    }
}