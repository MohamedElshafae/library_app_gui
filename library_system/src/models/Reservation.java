/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tuttrue
 */
public class Reservation extends Base{

    public int bookId;
    public int memberId;
    public DateTimeFormatter date;

    public Reservation(int bookId, int memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
    }

}
