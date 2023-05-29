package programmer.zaman.now.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {
    String name();

    String[] tags() default {};
}
