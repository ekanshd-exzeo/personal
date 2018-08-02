package javax.servlet;

import java.util.EventObject;

public class ServletRequestEvent extends EventObject {

    private final transient ServletRequest request;

    ServletRequestEvent(ServletContext sc, ServletRequest request) {
        super(sc);
        this.request = request;

    }


    ServletContext getServletContext() {
        return (ServletContext) super.getSource();
    }

    ServletRequest getServletRequest() {
        return null;
    }
}
