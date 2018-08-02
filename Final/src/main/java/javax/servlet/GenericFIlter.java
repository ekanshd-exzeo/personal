package javax.servlet;

import java.io.Serializable;
import java.util.Enumeration;

public abstract class GenericFIlter extends Object implements Filter, FilterConfig, Serializable {
    private transient FilterConfig filterConfig;

    public GenericFIlter() {
    }

    public FilterConfig getFilterConfig() {

        return filterConfig;
    }


    public void init() throws ServletException {

    }

    public void init(FilterConfig config) throws ServletException {
    this.filterConfig = config;

    init();
    }

    public String getFiltername() {
        return getFilterConfig().gerFiltername();
    }

    @Override
    public String getInitParameter(String name) {
        return getFilterConfig().getInitParameter(name);
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        return getFilterConfig().getInitParameterNames();
    }

    @Override
    public ServletContext getServletContext() {
        return getFilterConfig().getServletContext();
    }
}
