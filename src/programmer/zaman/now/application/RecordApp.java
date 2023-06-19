package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;

public class RecordApp {

    //record baikya hanya menyimpan data yang immutable = tidak diubah
    public static void main(String[] args) {
        LoginRequest login = new LoginRequest("Ahmad", "rahasia");
        //untuk mengambil field menggunakan buka tutup kurang setelah nama fieldnya
        System.out.println(login.username());
        System.out.println(login.password());
        System.out.println(login);

        System.out.println(new LoginRequest("ahmad"));
        System.out.println(new LoginRequest(""));
        System.out.println(login.sayHello());

    }
}
