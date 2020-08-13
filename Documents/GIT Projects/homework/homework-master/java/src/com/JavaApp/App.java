package com.JavaApp;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class App {
    public static void main( String[] args ) {
    }

    public static Integer response;
    MarylandInfo[] payments;

    //retrieve data from MD API
    public void sendRequestMD()  throws IOException {
        URL url = new URL("https://opendata.maryland.gov/resource/3ycv-rxy9.json");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        response = con.getResponseCode();

        InputStream input = con.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        StringBuilder result = new StringBuilder();

        String line;
        while((line = reader.readLine()) != null) {
            result.append(line);
        }
        String newLines = result.toString();
        Gson gson = new Gson();
        try {
          Type payments = new TypeToken<ArrayList<MarylandInfo>>(){}.getType();
          ArrayList<MarylandInfo> mpay = gson.fromJson(newLines, payments);
            //payments = gson.fromJson(newLines, MarylandInfo[].class);
        } catch (IllegalStateException | JsonSyntaxException e) {
            e.printStackTrace();
        }
        System.out.print(payments);
    }

    public


}
