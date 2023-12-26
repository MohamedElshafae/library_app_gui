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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import models.Author;
import models.Book;
import my_package.book_details;

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
            System.out.println(responseBody);
            Gson gson = new Gson();
            List<Book> books = gson.fromJson(responseBody, new TypeToken<List<Book>>() {
            }.getType());
            return books;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
        public static Boolean createBook(Book book) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3000/api/book"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(book.toJson()))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            return true;
        } catch (Exception e) {
            System.out.println("Error occurred:");
            System.out.println(e);
            return false;
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
    
    public static Book BorrowBook(int bookId, int memberId) {
        Map<String, Integer> data = new HashMap<>();
        data.put("bookId", bookId);
        data.put("memberId", memberId);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3000/api/borrow"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(new Gson().toJson(data)))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            Book b = new Gson().fromJson(responseBody, Book.class);
            System.out.println(b);
//            if (b.title == null) {
//                JOptionPane.showMessageDialog(new book_details(null), responseBody, "Error", JOptionPane.ERROR_MESSAGE);
//                return null;
//            }
            return b;
        } catch (Exception e) {
            System.out.println("Error occurred:");
            JOptionPane.showMessageDialog(new book_details(null), e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return null;
        }
    }


}
