package javax.servlet;

import java.io.IOException;

public interface Servlet {

    void destroy();
    ServletConfig getServletConfig() throws ServletException;
    String getServletinfo();
    void init(ServletConfig config) throws ServletException;
    void service(ServletRequest req,ServletResponse res) throws ServletException, IOException;
}
