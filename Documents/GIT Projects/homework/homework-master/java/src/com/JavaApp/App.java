package com.JavaApp;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main( String[] args ) {
    }

    public static Integer response;
    public static List<String> textLines = new ArrayList<>();

    public void sendRequestMD()  throws IOException {
        URL url = new URL("https://opendata.maryland.gov/resource/3ycv-rxy9.json");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        response = con.getResponseCode();

        InputStream input = con.getInputStream();
        String newLine = System.getProperty("line.separator");
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for (String line; (line = reader.readLine()) != null; ) {
            result.append(flag? newLine: "").append(line);
            flag = true;
        }
        result.toString();
    }


}
