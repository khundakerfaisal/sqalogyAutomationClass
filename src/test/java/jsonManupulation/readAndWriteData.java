package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.text.html.parser.Parser;
import java.io.*;

public class readAndWriteData {
    public static void main(String[] args) throws IOException, ParseException {


        try {
            String name = "Student-";
            int generateNumber = 1;
            String autoGenerateNumber = "";
            int lastNumberCount = 0;

            String filePath = "src/test/resources/studentLastName.json";
            JSONParser parser = new JSONParser();
            File file = new File(filePath);
            JSONArray lastAddedArray;
            if (!file.exists() || file.length() == 0) {
                lastAddedArray = new JSONArray();

            } else {
                lastAddedArray= (JSONArray) parser.parse(new FileReader(file));
            }
            if (!lastAddedArray.isEmpty()) {
                JSONObject lastAddedObject = (JSONObject) lastAddedArray.get(lastAddedArray.size() - 1);
                String lastStudentName = lastAddedObject.get("lastName").toString();
                lastNumberCount = Integer.parseInt(lastStudentName.replace(name, ""));

            } else {
                System.out.println("Print successfully");
            }
            for (int i = 1; i <= generateNumber; i++) {
                autoGenerateNumber = name + (lastNumberCount + i);
                System.out.println(autoGenerateNumber);
                JSONObject lastNameObj = new JSONObject();
                lastNameObj.put("lastName", autoGenerateNumber);
                lastAddedArray.add(lastNameObj);
            }

            FileWriter writer = new FileWriter(filePath);
            writer.write(lastAddedArray.toJSONString());
            writer.flush();
            writer.close();

        }
        catch (Exception e){
           e.printStackTrace();
        }



    }

}
