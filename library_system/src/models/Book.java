/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

/**
 *
 * @author tuttrue
 */
public class Book extends Base{
    public String title;
    public int authorId;
    public String description;
    public int publicationYear;
    public List<Genre> genres;
    public Author author;
    public List<Reservation> reservations;
    public List<Borrowing> Borrowings;
    
    public Book(String title, int authorId, String description, List<Genre> genres) {
        this.title = title;
        this.authorId = authorId;
        this.description = description;
        this.genres = genres;
    }

}
