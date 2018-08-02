package javax.servlet;

import java.util.EventObject;

public class ServletContextEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ServletContextEvent(Object source) {
        super(source);
    }




    public ServletContext getServletContext(){
        return (ServletContext) super.getSource();

    }
}
