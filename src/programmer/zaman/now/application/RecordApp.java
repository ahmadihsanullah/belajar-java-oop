package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest login = new LoginRequest("Ahmad", "rahasia");
        System.out.println(login.username());
        System.out.println(login.password());
        System.out.println(login);

        System.out.println(new LoginRequest("ahmad"));
    }
}
