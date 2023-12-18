/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import models.Book;
import models.Author;

/**
 *
 * @author tuttrue
 */
public class AuthorController {
        public static List<Author> getAllAuthors() {
        HttpRequest x = (HttpRequest) HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3000/api/Author"))
                .GET().build();
        HttpClient httpClient = HttpClient.newHttpClient();
        try {

            HttpResponse<String> response = httpClient.send(x, HttpResponse.BodyHandlers.ofString());

            String responseBody = response.body();
            Gson gson = new Gson();

            List<Author> authors = gson.fromJson(responseBody, new TypeToken<List<Author>>(){}.getType());
            
            return authors;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    private static class AuthorsResponse {
        private List<Author> authors;

        public List<Author> getAuthors() {
            return authors;
        }
    }
    
    public static Author getAuthorById(int id) {
        HttpRequest x = (HttpRequest) HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3000/api/author/" + id))
                .GET().build();
        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            HttpResponse<String> response = httpClient.send(x, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            Gson gson = new Gson();
            Author author = gson.fromJson(responseBody, Author.class);
            return author;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


}
