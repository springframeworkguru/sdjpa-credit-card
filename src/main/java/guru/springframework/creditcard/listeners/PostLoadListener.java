package guru.springframework.creditcard.listeners;

import org.hibernate.event.spi.PostLoadEvent;
import org.hibernate.event.spi.PostLoadEventListener;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 6/29/22.
 */
@Component
public class PostLoadListener implements PostLoadEventListener {

    @Override
    public void onPostLoad(PostLoadEvent event) {
        System.out.println("In Post Load");
    }
}
