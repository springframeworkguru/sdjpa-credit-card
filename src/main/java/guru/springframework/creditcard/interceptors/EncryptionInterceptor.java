package guru.springframework.creditcard.interceptors;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by jt on 6/28/22.
 */
@Component
public class EncryptionInterceptor extends EmptyInterceptor {
    @Override
    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, Type[] types) {

        System.out.println("I'm in onFlushDirty");

        return super.onFlushDirty(entity, id, currentState, previousState, propertyNames, types);
    }

    @Override
    public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        System.out.println("I'm in onLoad");

        return super.onLoad(entity, id, state, propertyNames, types);
    }

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        System.out.println("I'm in onSave");

        return super.onSave(entity, id, state, propertyNames, types);
    }
}
