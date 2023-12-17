/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

import models.Member;
import my_package.Login;
import my_package.sign_up;

/**
 *
 * @author tuttrue
 */
public class MemberController {

    public static List<Member> getMembers() {
        HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3000/api/member"))
                .GET().build();
        HttpClient httpClient = HttpClient.newHttpClient();
        try {

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            String responseBody = response.body();
            Gson gson = new Gson();

            MembersResponse membersResponse = gson.fromJson(responseBody, MembersResponse.class);

            return membersResponse.getMembers();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static Member getMemberByEmail(String email) {

        Map<String, String> emailData = new HashMap<>();
        emailData.put("email", email);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3000/api/member/1"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(new Gson().toJson(emailData)))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        try {

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            String responseBody = response.body();
            Gson gson = new Gson();

            Member memberRes = gson.fromJson(responseBody, Member.class);

            if (memberRes.name == null) {
                JOptionPane.showMessageDialog(new Login(), "Email is not correct", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            return memberRes;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void createMember(Member member) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3000/api/member"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(member.toJson()))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            new Gson().fromJson(responseBody, Member.class);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new sign_up(), "This email already exists", "error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }

    private static class MembersResponse {

        private List<Member> members;

        public List<Member> getMembers() {
            return members;
        }
    }

}
