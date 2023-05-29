package programmer.zaman.now.application;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUsername("ahmad");
        createUserRequest.setPassword("rahasia");
        createUserRequest.setName("Ihsan");

        ValidationUtil.validateReflection(createUserRequest);
    }
}
