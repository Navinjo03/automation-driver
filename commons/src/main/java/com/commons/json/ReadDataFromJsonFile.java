package com.commons.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromJsonFile {
    public Object[][] provideSignInDataFromJSON() {
        final JSONParser jsonParser = new JSONParser();
        final List<Object[]> data = new ArrayList<>();

        try (FileReader reader = new FileReader("C:\\Users\\snjon\\IdeaProjects\\FrameWork\\src\\main\\resources\\Data.json")) {
            final Object obj = jsonParser.parse(reader);

            if (obj instanceof JSONArray) {
                final JSONArray jsonArray = (JSONArray) obj;

                for (final Object item : jsonArray) {
                    final JSONObject jsonObject = (JSONObject) item;

                    final String email = (String) jsonObject.get("EMAIL");
                    final String password = (String) jsonObject.get("PASSWORD");
                    final Object[] pair = {email, password};
                    data.add(pair);

                    System.out.println("Email: " + email);
                    System.out.println("Password: " + password);
                }

            } else if (obj instanceof JSONObject) {
                final JSONObject dataJsonObj = (JSONObject) obj;
                final String email = (String) dataJsonObj.get("EMAIL");
                final String password = (String) dataJsonObj.get("PASSWORD");

                final Object[] pair = {email, password};
                data.add(pair);

                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            } else {
                System.out.println("Invalid JSON structure");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return data.toArray(new Object[0][]);
    }

    public Object[][] provideSignUpDataFromJSON() {
        final JSONParser jsonParser = new JSONParser();
        final List<Object[]> data = new ArrayList<>();

        try (FileReader reader = new FileReader("C:\\Users\\snjon\\IdeaProjects\\FrameWork\\src\\main\\resources\\signUp.json")) {
            final Object obj = jsonParser.parse(reader);

            if (obj instanceof JSONArray) {
                final JSONArray jsonArray = (JSONArray) obj;

                for (final Object item : jsonArray) {
                    final JSONObject jsonObject = (JSONObject) item;

                    final String email = (String) jsonObject.get("enterMail");
                    final String name = (String) jsonObject.get("enterName");
                    final String password = (String) jsonObject.get("enterPassword");
                    final String confirm_password = (String) jsonObject.get("enterConfirmPassword");
                    final String comName = (String) jsonObject.get("company");
                    final String userRole = (String) jsonObject.get("JobRole");


                    final Object[] pair = {email, name, password, confirm_password, comName, userRole};
                    data.add(pair);

                    System.out.println("Email: " + email);
                    System.out.println("Name: " + name);
                    System.out.println("Password: " + password);
                    System.out.println("ConfirmPassword: " + confirm_password);
                    System.out.println("CompanyName: " + comName);
                    System.out.println("userRole" + userRole);
                }

            } else if (obj instanceof JSONObject) {
                final JSONObject jsonObject = (JSONObject) obj;

                final String email = (String) jsonObject.get("enterMail");
                final String name = (String) jsonObject.get("enterName");
                final String password = (String) jsonObject.get("enterPassword");
                final String confirm_password = (String) jsonObject.get("enterConfirmPassword");
                final String comName = (String) jsonObject.get("company");
                final String userRole = (String) jsonObject.get("JobRole");

                System.out.println("Email: " + email);
                System.out.println("Name: " + name);
                System.out.println("Password: " + password);
                System.out.println("ConfirmPassword: " + confirm_password);
                System.out.println("CompanyName: " + comName);
                System.out.println("userRole" + userRole);
            } else {
                System.out.println("Invalid JSON structure");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return data.toArray(new Object[0][]);
    }
}





