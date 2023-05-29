package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ExceptionApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        }catch (ValidationException | NullPointerException e){
            System.out.println("Terjadi error : " + e.getMessage());
        }finally {
            System.out.println("Tetap dieksekusi, error gk error");
        }

        LoginRequest loginRequest1 = new LoginRequest("null", "null");
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("Sukses");
    }
}
