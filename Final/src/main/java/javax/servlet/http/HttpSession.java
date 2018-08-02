package javax.servlet.http;

import javax.servlet.ServletContext;

import java.util.Enumeration;

public interface HttpSession {
    Object getAttribute(String name);
    Enumeration<String> getAttributeNames();
    long getCreationTime();
    String getId();
    long getLastAccesedTime();
    int getMaxInactiveInterval();
    ServletContext getServletContext();
    void invalidate();
    boolean isNew();
    void removeAttribute(String name);
    void setAttribute(String name,Object value);
    void setMaxInactiveInterval(int interval);


}
