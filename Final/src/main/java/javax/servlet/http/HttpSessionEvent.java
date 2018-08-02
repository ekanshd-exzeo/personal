package javax.servlet.http;

import java.util.EventObject;

public class HttpSessionEvent extends EventObject {
    public HttpSessionEvent(HttpSession source) {
        super(source);

    }


    public HttpSession getSession() {
        return (HttpSession) super.getSource();
    }
}
