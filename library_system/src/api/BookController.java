/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import models.Author;
import models.Book;

/**
 *
 * @author tuttrue
 */
public class BookController {

    public static List<Book> getAllBooks() {
        HttpRequest x = (HttpRequest) HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3000/api/book"))
                .GET().build();
        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            HttpResponse<String> response = httpClient.send(x, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            Gson gson = new Gson();
            List<Book> books = gson.fromJson(responseBody, new TypeToken<List<Book>>() {
            }.getType());
            return books;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void createBook(Book book) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3000/api/book"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(book.toJson()))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
        } catch (Exception e) {
            System.out.println("Error occurred:");
            System.out.println(e);
        }
    }

    public static List<Book> getBooksByAuthorId(int id) {
        HttpRequest x = (HttpRequest) HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3000/api/book/"+id))
                .GET().build();
        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            HttpResponse<String> response = httpClient.send(x, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            Gson gson = new Gson();
            List<Book> books = gson.fromJson(responseBody, new TypeToken<List<Book>>() {
            }.getType());
            return books;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    private static class BooksResponse {

        private List<Book> books;

        public List<Book> getBooks() {
            return books;
        }
    }
}
