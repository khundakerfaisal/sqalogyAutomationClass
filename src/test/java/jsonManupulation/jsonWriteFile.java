package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class jsonWriteFile {
    public static void main(String[] args) throws IOException, ParseException {
        String filePath = "src/test/resources/studentLastName.json";
        String name="Student-";
        String generateNumber = "";
        int generateCount=1;
        for (int i=1;i<=generateCount;i++){
            generateNumber=name+i;
            System.out.println(generateNumber);

        }
        File file=new File(filePath);
        JSONParser parser=new JSONParser();
        JSONArray lastNamedArray;
        if (!file.exists()|| file.length()==0){
            lastNamedArray=new JSONArray();
        }
        else {
            lastNamedArray= (JSONArray) parser.parse(new FileReader(filePath));

        }
        //If the array is blank system show array null exception
             //        JSONArray lastNamedArray= lastNamedArray= (JSONArray) parser.parse(new FileReader(filePath));
        JSONObject lastNumberObj=new JSONObject();
        lastNumberObj.put("lastName",generateNumber);
        lastNamedArray.add(lastNumberObj);
        Writer writer=new FileWriter(filePath);
        writer.write(lastNamedArray.toJSONString());
        writer.flush();
        writer.close();
    }

}
