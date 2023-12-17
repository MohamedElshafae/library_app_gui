/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author tuttrue
 */
public class MemberSingleton {
    private static MemberSingleton instance;
    private Member member;

    private MemberSingleton() {
        // Private constructor to prevent instantiation
    }

    public static MemberSingleton getInstance() {
        if (instance == null) {
            instance = new MemberSingleton();
        }
        return instance;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
