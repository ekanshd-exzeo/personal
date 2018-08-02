package javax.servlet;

import javax.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public abstract class ServletRequestWrapper extends Object implements ServletRequest {

    private ServletRequest request;

    public ServletRequestWrapper(ServletRequest request) throws IllegalArgumentException {
        if (request == null) {
            throw new IllegalArgumentException("Request cannot be null");
        }
        this.request = request;
    }

    public ServletRequest getRequest() {
        return this.request;
    }

    public void setRequest(ServletRequest request) {
        if (request == null) {
            throw new IllegalArgumentException(" REQUEST cannot be NULL");
        }
        this.request = request;
    }

    @Override
    public Object getAttribute(String var1) {
        return this.request.getAttribute(var1);
    }

    @Override
    public Enumeration<String> getAttributeNames() {
        return this.request.getAttributeNames();
    }

    @Override
    public String getCharacterEncoding() {
        return this.request.getCharacterEncoding();
    }

    @Override
    public void setCharacterEncoding(String var1) throws UnsupportedEncodingException {
        this.request.setCharacterEncoding(var1);
    }

    @Override
    public int getContentLength() {
        return this.request.getContentLength();
    }

    @Override
    public long getContentLengthLong() {
        return this.request.getContentLengthLong();
    }

    @Override
    public String getContentType() {
        return this.request.getContentType();
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        return this.request.getInputStream();
    }

    @Override
    public String getParameter(String var1) {
        return this.request.getParameter(var1);
    }

    @Override
    public Enumeration<String> getParameterNames() {
        return this.request.getParameterNames();
    }

    @Override
    public String[] getParameterValues(String var1) {
        return this.request.getParameterValues(var1);
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        return this.request.getParameterMap();
    }

    @Override
    public String getProtocol() {
        return this.request.getProtocol();
    }

    @Override
    public String getScheme() {
        return this.request.getScheme();
    }

    @Override
    public String getServerName() {
        return this.request.getServerName();
    }

    @Override
    public int getServerPort() {
        return this.request.getServerPort();
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return this.request.getReader();
    }

    @Override
    public String getRemoteAddr() {
        return this.request.getRemoteAddr();
    }

    @Override
    public String getRemoteHost() {
        return this.request.getRemoteHost();
    }

    @Override
    public void setAttribute(String var1, Object var2) {
        this.request.setAttribute(var1, var2);
    }

    @Override
    public void removeAttribute(String var1) {
        this.request.removeAttribute(var1);
    }

    @Override
    public Locale getLocale() {
        return this.request.getLocale();
    }

    @Override
    public Enumeration<Locale> getLocales() {
        return this.request.getLocales();
    }

    @Override
    public boolean isSecure() {
        return this.request.isSecure();
    }

    @Override
    public RequestDispatcher getRequestDispatcher(String var1) {
        return this.request.getRequestDispatcher(var1);
    }

    @Override
    public int getRemotePort() {
        return this.request.getRemotePort();
    }

    @Override
    public String getLocalName() {
        return this.request.getLocalName();
    }

    @Override
    public String getLocalAddr() {
        return this.request.getLocalAddr();
    }

    @Override
    public int getLocalPort() {
        return this.request.getLocalPort();
    }

    @Override
    public ServletContext getServletContext() {
        return this.request.getServletContext();
    }

    @Override
    public AsyncContext startAsync() throws IllegalStateException {
        return request.startAsync();
    }

    @Override
    public AsyncContext startAsync(ServletRequest var1, ServletResponse var2) throws IllegalStateException {
        return request.startAsync(var1, var2);
    }

    @Override
    public boolean isAsyncStarted() {
        return request.isAsyncStarted();
    }

    @Override
    public boolean isAsyncSupported() {
        return request.isAsyncSupported();
    }

    @Override
    public AsyncContext getAsyncContext() {
        return request.getAsyncContext();
    }

    @Override
    public DispatcherType getDispatcherType() {
        return this.request.getDispatcherType();
    }

    boolean isWrapperFor(Class<?> WrappedType) {
        if (WrappedType.isAssignableFrom(request.getClass())) {
            return true;
        }
        if (request instanceof ServletRequestWrapper) {
            return ((ServletRequestWrapper) request).isWrapperFor(WrappedType);
        }
        return false;
    }

    public boolean isWrapperFor(ServletRequest wrapped) {
        if (request == wrapped) {
            return true;
        }
        if (request instanceof ServletRequestWrapper) {
            return ((ServletRequestWrapper) request).isWrapperFor(wrapped);
        }
        return false;
    }

    public boolean authenticate(HttpServletResponse response) {
        return false;
    }
}
