package parse_json_xml.parcer;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JParcer {
    //JSONObject jsonFile;
    String fileName;


    public JParcer(String fileName) {
        this.fileName = fileName;
    }

    public void parseFile()
    {
        // create a
        Reader reader = null;
        try{
             reader = Files.newBufferedReader(Paths.get(fileName));
        }
        catch(Exception e)
        {
            //Todo:
            System.out.println(e.getMessage());
        }


        // create parser
        if (reader != null) {
            try {
                JsonObject parser = (JsonObject) Jsoner.deserialize(reader);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
