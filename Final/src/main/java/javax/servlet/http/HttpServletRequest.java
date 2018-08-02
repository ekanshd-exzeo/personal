package javax.servlet.http;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;


import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;

public interface HttpServletRequest extends ServletRequest {
    static String BASIC_AUTH = "BASIC";
    static String CLIENT_CERT_AUTH = "CLIENT CERTIFICATE";
    static String DIGEST_AUTH = "DIGEST";
    static String FORM_AUTH = "FORM";

    // boolean authenticate(HttpServletResponse response);


    String changeSessionId();

    String getAuthType();

    String getContextPath();

    Cookie[] getCookies();

    long getDateHeader(String name);

    String getHeader(String name);

    Enumeration<String> getHeaderNames();

    Enumeration<String> getHeaders(String name);

    default HttpServletMapping getHttpServletMapping() {
        return null;
    }

    int getInitHeader(String name);

    String getMethod();

    Part getPart(String name);

    Collection<Part> getParts();

    String getPathInfo();

    String getPathTranslated();

    String getQueryString();

    String getRemoteUser();

    String getRequestSessionId();

    String getRequestURI();

    StringBuffer getRequestURL();

    String getServletPath();

    HttpSession getSession();

    HttpSession getSession(boolean create);

    default Map<String, String> getTrailerFields() {
        return null;
    }

    Principal getUserPrincipal() throws IOException, ServletException;

    boolean isRequestedSessionIdFromCookie() throws IOException, ServletException;

    boolean isRequestedSessionIdFromURL() throws IOException, ServletException;

    boolean isRequestedSessionIdValid() throws IOException, ServletException;

    default boolean isTrailerFieldReady() throws IOException, ServletException {
        return false;
    }

    boolean isUserInRole(String role);

    void login(String username, String password) throws IOException, ServletException;

    void logout() throws IOException, ServletException;

    default PushBuilder newPushBuilder() throws IOException, ServletException {
        return null;
    }

    <T extends HttpUpgradeHandler> T upgrade(Class<T> handlerClass) throws IOException, ServletException;


}
