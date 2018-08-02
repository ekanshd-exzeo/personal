package javax.servlet;

import java.util.EventListener;

public interface ServletContextListener extends EventListener {
    default void contextDestroyed(ServletContextEvent sce){

    }

    default void contextInitialized(ServletContextEvent sce){

    }
}
