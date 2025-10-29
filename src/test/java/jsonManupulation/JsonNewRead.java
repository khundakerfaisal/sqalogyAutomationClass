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
        String fileLocation = "src/test/resources/Student.json";
        String prefixName = "student-";
        int studentCountNumber = 1;  // how many new students to add
        int lastNumber = 0;
        String generateStudentId = "";

        JSONArray jsonArray;
        JSONParser parser = new JSONParser();

        try {

            jsonArray = (JSONArray) parser.parse(new FileReader(fileLocation));
        } catch (Exception e) {

            jsonArray = new JSONArray();
        }


        if (!jsonArray.isEmpty()) {
            JSONObject lastNameObject = (JSONObject) jsonArray.get(jsonArray.size() - 1);
            String lastNameStudent = lastNameObject.get("Name").toString();
            lastNumber = Integer.parseInt(lastNameStudent.replace(prefixName, ""));
        }


        for (int i = 1; i <= studentCountNumber; i++) {
            generateStudentId = prefixName + (lastNumber + i);

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("Name", generateStudentId);
            jsonArray.add(jsonObject);
        }

        FileWriter writer = new FileWriter(fileLocation);
        writer.write(jsonArray.toJSONString());
        writer.flush();
        writer.close();


    }

}
