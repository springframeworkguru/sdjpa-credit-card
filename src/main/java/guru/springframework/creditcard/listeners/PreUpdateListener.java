package guru.springframework.creditcard.listeners;

import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 6/29/22.
 */
@Component
public class PreUpdateListener implements PreUpdateEventListener {

    @Override
    public boolean onPreUpdate(PreUpdateEvent event) {
        System.out.println("In Pre Update");

        return false;
    }
}
