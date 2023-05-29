package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseErrorApp {
    public static void main(String[] args) {
        connetDatabase("ahmad",null);
        System.out.println("Sukses masuk ke database");
    }

    public static void connetDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
