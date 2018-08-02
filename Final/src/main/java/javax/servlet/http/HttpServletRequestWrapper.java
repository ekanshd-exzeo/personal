package javax.servlet.http;

import javax.servlet.ServletException;
import javax.servlet.ServletRequestWrapper;

import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;

public  class HttpServletRequestWrapper extends ServletRequestWrapper implements HttpServletRequest {
    public HttpServletRequestWrapper(HttpServletRequest request) throws IllegalArgumentException {
        super(request);
    }
    public HttpServletRequest getHttpServletRequest(){
        return (HttpServletRequest) super.getRequest();
    }


    public HttpServletMapping getHttpServletMapping() {
        return getHttpServletRequest().getHttpServletMapping();
    }

    
    public void logout() throws IOException, ServletException {
    this.getHttpServletRequest().logout();
    }

    
    public PushBuilder newPushBuilder() throws IOException, ServletException {
        return this.getHttpServletRequest().newPushBuilder();
    }

    
    public <T extends HttpUpgradeHandler> T upgrade(Class<T> handlerClass) throws IOException, ServletException {
        return this.getHttpServletRequest().upgrade(handlerClass);
    }


    
    public String changeSessionId() {
        return this.getHttpServletRequest().changeSessionId();
    }

    
    public String getAuthType() {
        return this.getHttpServletRequest().getAuthType();
    }

    
    public String getContextPath() {
        return this.getHttpServletRequest().getContextPath();
    }

    
    public Cookie[] getCookies() {
        return this.getHttpServletRequest().getCookies();
    }

    
    public long getDateHeader(String name) {
        return this.getHttpServletRequest().getDateHeader(name);
    }

    
    public String getHeader(String name) {
        return this.getHeader(name);
    }

    
    public Enumeration<String> getHeaderNames() {
        return this.getHttpServletRequest().getHeaderNames();
    }

    
    public Enumeration<String> getHeaders(String name) {
        return this.getHttpServletRequest().getHeaders(name);
    }

    HttpServletMapping getServletMapping(){

        return this.getHttpServletRequest().getHttpServletMapping();
    }

    
    public int getInitHeader(String name) {
        return this.getHttpServletRequest().getInitHeader(name);
    }

    
    public String getMethod() {
        return this.getHttpServletRequest().getMethod();
    }

    
    public Part getPart(String name) {
        return this.getHttpServletRequest().getPart(name);
    }

    
    public Collection<Part> getParts() {
        return this.getHttpServletRequest().getParts();
    }

    
    public String getPathInfo() {
        return this.getHttpServletRequest().getPathInfo();
    }

    
    public String getPathTranslated() {
        return this.getHttpServletRequest().getPathTranslated();
    }

    
    public String getQueryString() {
        return this.getHttpServletRequest().getQueryString();
    }

    
    public StringBuffer getRequestURL() {
        return this.getHttpServletRequest().getRequestURL();
    }

    
    public String getRemoteUser() {
        return this.getHttpServletRequest().getRemoteUser();
    }

    
    public String getRequestSessionId() {
        return this.getHttpServletRequest().getRequestSessionId();
    }

    
    public String getRequestURI() {
        return this.getHttpServletRequest().getRequestURI();
    }

    
    public String getServletPath() {
        return this.getHttpServletRequest().getServletPath();
    }

    
    public HttpSession getSession() {
        return this.getHttpServletRequest().getSession();
    }

    
    public HttpSession getSession(boolean create) {
        return this.getHttpServletRequest().getSession(create);
    }

    
    public Map<String, String> getTrailerFields() {
        return this.getHttpServletRequest().getTrailerFields();
    }

    
    public Principal getUserPrincipal() throws IOException, ServletException {
        return getHttpServletRequest().getUserPrincipal();
    }

    
    public boolean isRequestedSessionIdFromCookie() throws IOException, ServletException {
        return this.getHttpServletRequest().isRequestedSessionIdFromCookie();
    }

    
    public boolean isRequestedSessionIdFromURL() throws IOException, ServletException {
        return this.getHttpServletRequest().isRequestedSessionIdFromURL();
    }

    
    public boolean isRequestedSessionIdValid() throws IOException, ServletException {
        return this.getHttpServletRequest().isRequestedSessionIdValid();
    }

    
    public boolean isTrailerFieldReady() throws IOException, ServletException {
        return this.getHttpServletRequest().isTrailerFieldReady();
    }

    
    public boolean isUserInRole(String role) {
        return this.getHttpServletRequest().isUserInRole(role);
    }

    
    public void login(String username, String password) throws IOException, ServletException {
        this.getHttpServletRequest().login(username, password);
    }

}
