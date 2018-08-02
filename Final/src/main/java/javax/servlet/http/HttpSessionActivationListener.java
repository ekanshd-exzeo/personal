package javax.servlet.http;

import java.util.EventListener;

public interface HttpSessionActivationListener extends EventListener {

    default void sessionDidActivate(HttpSessionEvent se){

    }

    default void sessionWillPassivate(HttpSessionEvent se){

    }
}
