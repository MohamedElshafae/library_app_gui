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
public class Member {
    public String name;
    public String address;
    public String phone;
    public String email;
    public String password;
    public boolean isAuthor;
    
    
    public Member(String name, String address, String phone, String email, String password, boolean isAuthor) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.isAuthor = isAuthor;
    }    
}
