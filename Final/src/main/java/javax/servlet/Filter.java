package javax.servlet;


import java.io.IOException;

public interface Filter {

    default void destroy() {

    }

    public void doFIlter (ServletRequest request, ServletResponse response, FilterChain chain)throws IOException ,ServletException;

    default void init(FilterConfig filterconfig) throws ServletException {

    }

}
