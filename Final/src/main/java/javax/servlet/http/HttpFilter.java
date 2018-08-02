package javax.servlet.http;

import javax.servlet.FilterChain;
import javax.servlet.GenericFIlter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;

public abstract class HttpFilter extends GenericFIlter {

    HttpFilter() {
    }

    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {

        chain.doFilter(req, res);

    }

    void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

        if (!(req instanceof HttpServletRequest)) {
            throw new ServletException(req + " not HTTPSERVLET REQUEST");
        }

        if (!(res instanceof HttpServletResponse)) {
            throw new ServletException(res + " not HTTPSERVLET RESPONSE");
        }
        doFilter((HttpServletRequest) req,(HttpServletResponse) res, chain);

    }
}
