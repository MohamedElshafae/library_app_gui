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
public class Author extends Base {
    public int memberId;
    public List<Book> books;
    
    public Author(int memberId, List<Book> books) {
        this.memberId = memberId;
        this.books = books;
    }
    
}
