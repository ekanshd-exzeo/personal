package javax.servlet;

import java.util.Enumeration;

public interface ServletConfig {

    String getInitParameter(String name);

    Enumeration<String> getInitParameterNames();

    ServletContext getServletContext();

    String getServletName();
}
