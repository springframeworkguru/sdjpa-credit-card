package guru.springframework.creditcard.interceptors;

import java.lang.annotation.*;

/**
 * Created by jt on 6/29/22.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface EncryptedString {
}
