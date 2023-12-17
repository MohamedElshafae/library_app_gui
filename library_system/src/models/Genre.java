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
public class Genre {
    public String name;
    public List<Book> books;
    
    
    public Genre(String name) {
        this.name = name;
    }
    

}
