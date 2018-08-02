package javax.servlet;
import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;

public class GenericServlet extends Object implements ServletConfig,Serializable,Servlet {
    private transient ServletConfig config;

    public void init(ServletConfig servletConfig) throws ServletException {
        this.config=servletConfig;
        this.init();
    }

    private void init() throws ServletException{
    }


    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public String getServletinfo() {
        return null;
    }

    public GenericServlet() {

    }


    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    public String getServletInfo() {
        return "";
    }

    public void destroy() {

    }

    public String getServletName() {
        return null;
    }

    public ServletContext getServletContext() {
        return getServletConfig().getServletContext();
    }

    public String getInitParameter(String name) {
        return getServletConfig().getInitParameter(name);
    }

    public Enumeration<String> getInitParameterNames() {
        return getServletConfig().getInitParameterNames();
    }
}