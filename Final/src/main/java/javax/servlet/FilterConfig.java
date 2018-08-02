package javax.servlet;

import java.util.Enumeration;

public interface FilterConfig {
    String gerFiltername();
    String getInitParameter(String name);
    Enumeration<String > getInitParameterNames();
    ServletContext getServletContext();
}
