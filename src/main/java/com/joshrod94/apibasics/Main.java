package com.joshrod94.apibasics;

import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class Main {
    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        // Step 1: Create an HTTP client
        // Step 2: Create an HTTP request
        // Step 3: Send the request
        // Step 4: Receive the response
        // Step 5: Print the response

        int statusCode = response.statusCode();
        System.out.println("Status code: " + statusCode);
            if (statusCode == 200) {
                System.out.println("Request successful. Response body:");
                System.out.println(response.body());
                String responseBody = response.body();
                    if (responseBody.contains("current_user_url")) {
                        System.out.println("Found key: current_user_url");
                    } else {
                        System.out.println("Key not found");
                    }

            } else {
                System.out.println("Request failed.");
                System.out.println("Response body:");
                System.out.println(response.body());
            }


    }
}
