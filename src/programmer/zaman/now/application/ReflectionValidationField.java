package programmer.zaman.now.application;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.util.ValidationUtil;

public class ReflectionValidationField {

    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUsername("ahmad");
        createUserRequest.setPassword("ahmad");
        createUserRequest.setName("ahmad");

        //melakukan pengujian
        ValidationUtil.validationReflectionMoreFiveChar(createUserRequest);

    }
}
