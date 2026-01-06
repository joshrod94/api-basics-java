package com.joshrod94.apibasics;

import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpRequest;


public class Main {
    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com"))
                .GET()
                .build();
        // Step 1: Create an HTTP client
        // Step 2: Create an HTTP request
        // Step 3: Send the request
        // Step 4: Receive the response
        // Step 5: Print the response

        System.out.println("Program started");
    }
}
