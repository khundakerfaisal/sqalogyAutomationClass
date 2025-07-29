package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class jsonReadAndWriteFile {
    public static void main(String[] args) throws IOException, ParseException {
        String filePath = "src/test/resources/studentLastName.json";
        String name="Student-";
        String generateNumber = "";
        int generateCount=1;
        int lastNumber=0;

        File file=new File(filePath);
        JSONParser parser=new JSONParser();
        JSONArray lastNamedArray;

        if (!file.exists()|| file.length()==0){
            lastNamedArray=new JSONArray();
        }
        else {
            lastNamedArray= (JSONArray) parser.parse(new FileReader(filePath));

        }
        if (!lastNamedArray.isEmpty()){
            JSONObject lastNameObjCheck= (JSONObject) lastNamedArray.get(lastNamedArray.size()-1);
            String lastName=lastNameObjCheck.get("lastName").toString();
            lastNumber= Integer.parseInt(lastName.replace(name,""));


        }
        for (int i=1;i<=generateCount;i++){
            generateNumber=name+(lastNumber+i);
            System.out.println(generateNumber);
            JSONObject lastNumberObj=new JSONObject();
            lastNumberObj.put("lastName",generateNumber);
            lastNamedArray.add(lastNumberObj);
        }



        Writer writer=new FileWriter(filePath);
        writer.write(lastNamedArray.toJSONString());
        writer.flush();
        writer.close();
    }

}
