package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonNewRead {
    public static void main(String[] args) throws ParseException, IOException {
        String fileLocation="src/test/resources/Student.json";
        String studentId="student-1";
        JSONArray jsonArray;

        JSONParser parser=new JSONParser();
        try{
            jsonArray= (JSONArray) parser.parse(new FileReader(fileLocation));
        }
        catch (Exception e){
            jsonArray = new JSONArray();
        }
            //        //        File file = new File(fileLocation);
            //        if (file.exists() && file.length()>0){
            //             jsonArray= (JSONArray) parser.parse(new FileReader(fileLocation));
            //        }
            //        else {
            //             jsonArray = new JSONArray();
            //        }

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("Name",studentId);
        jsonArray.add(jsonObject);
        FileWriter writer=new FileWriter(fileLocation);
        writer.write(jsonArray.toJSONString());
        writer.flush();
        writer.close();


    }

}
