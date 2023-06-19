package programmer.zaman.now.util;

import programmer.zaman.now.annotation.NotBlank;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException , NullPointerException{
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else  if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if(loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else  if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if(loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    public static void validateReflection(Object object){
        //mendapatkan class
        Class aClass = object.getClass();

        //mendapatkan fields dari classnya
        //getDeclaredField => akan mendapatkan field (public ataupun private)
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields){
            // status akses field harus diubah terlebih dahulu menjadi true, agar dapat diakses
            field.setAccessible(true);
                //cari field yang memiliki annotation NotBlank
            if(field.getAnnotation(NotBlank.class) != null){
                //validated
                try {
                    //simpan field kedalam variable value
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                }catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses " + field.getName());
                }
            }
        }
    }


}
