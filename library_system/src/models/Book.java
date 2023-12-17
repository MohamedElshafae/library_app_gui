/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author tuttrue
 */
public class Book {
    public String title;
    public int authorId;
    public String description;
    
    public Book(String title, int authorId, String description) {
        this.title = title;
        this.authorId = authorId;
        this.description = description;
    }
    public String toJson() {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(this);
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", authorId=" + authorId +
                '}';
    } 
}
