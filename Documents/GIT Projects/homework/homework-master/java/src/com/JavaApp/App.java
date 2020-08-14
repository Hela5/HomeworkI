package com.JavaApp;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import com.sun.net.httpserver.HttpHandler;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
    }

    public static Integer response;
    MarylandInfo[] payments;

    //using Google HTTP Client reqs
    public static MDPayments parseMDinfo(HttpResponse hresponse) throws IOException{
        HttpClient httpClient= new DefaultHttpClient();
        HttpRequest hrequest;
        HttpGet httpGet = new HttpGet();
        URL url = new URL("https://opendata.maryland.gov/resource/3ycv-rxy9.json");
        HttpResponse response = httpClient.execute(httpGet(url));
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        MDPayments mdpayments = hresponse.parseAs(MDPayments.class);
        if(mdpayments.getPayments().isEmpty()){
            System.out.println("No Results");
        } else {
            for(MarylandInfo marylandInfo : mdpayments.getPayments()){
                marylandInfo.getAgencyName();
            }
        }
        return null;
    }


    //retrieve data from MD API using GSON
    public void sendRequestMDwithGSON()  throws IOException {
        URL url = new URL("https://opendata.maryland.gov/resource/3ycv-rxy9.json");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        response = con.getResponseCode();
        con.setRequestMethod("GET");
        InputStream input = con.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        StringBuilder result = new StringBuilder();

        String line;
        while((line = reader.readLine()) != null) {
            result.append(line);
        }
        String newLines = result.toString();
        //attempt at converting to JSON Object beforehand
        HttpHandler handle;
        handle.handle();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put(newLines);
        JSONArray pments = jsonObject. getAsJsonArray();

        for (int i = 0; i < pments.length(); i++) {
            JSONObject c = pments.getJSONObject(i);

        //GSON

        Gson gson = new Gson();
        try {
        // try to convert into arraylist for storing into class
          Type payments = new TypeToken<ArrayList<MarylandInfo>>(){}.getType();
          ArrayList<MarylandInfo> mpay = gson.fromJson(newLines, payments);

          //another way to convert into an array - still has error with String
          //payments = gson.fromJson(newLines, MarylandInfo[].class);
        } catch (IllegalStateException | JsonSyntaxException e) {
            e.printStackTrace();
        }
        //always prints as null
        System.out.print(payments);
    }



}
