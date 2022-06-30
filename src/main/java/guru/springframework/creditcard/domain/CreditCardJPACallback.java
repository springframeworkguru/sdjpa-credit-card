package guru.springframework.creditcard.domain;

import jakarta.persistence.*;

/**
 * Created by jt on 6/30/22.
 */
public class CreditCardJPACallback {

    @PrePersist
    @PreUpdate
    public void beforeInsertOrUpdate(CreditCard creditCard) {

        System.out.println("before update was called...");

    }

    @PostPersist
    @PostLoad
    @PostUpdate
    public void postLoad(CreditCard creditCard) {
        System.out.println("Post Load was called...");
    }

}
