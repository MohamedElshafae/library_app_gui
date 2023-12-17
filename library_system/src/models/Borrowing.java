/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author tuttrue
 */
public class Borrowing {
    public int bookId;
    public int memberId;
    
    public DateTimeFormatter date;
    public DateTimeFormatter returnDate;

    public Borrowing(int bookId, int memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
    }

}
