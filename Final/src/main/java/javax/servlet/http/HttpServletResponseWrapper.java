package javax.servlet.http;

import javax.servlet.ServletResponseWrapper;

import java.util.Collection;

public class HttpServletResponseWrapper extends ServletResponseWrapper implements HttpServletResponse {

    public HttpServletResponseWrapper(HttpServletResponse response) {
        super(response);

    }

    private HttpServletResponse getHttpServletResponse() {
        return (HttpServletResponse) super.getResponse();
    }

    @Override
    public void addCookie(Cookie cookie) {
        this.getHttpServletResponse().addCookie(cookie);
    }

    @Override
    public void addDateHeader(String name, long date) {
        this.getHttpServletResponse().addDateHeader(name, date);
    }

    @Override
    public void addHeader(String name, String value) {
        this.addHeader(name, value);
    }

    @Override
    public void addIntHeader(String name, int value) {
        this.addIntHeader(name, value);
    }

    @Override
    public boolean containsHeader(String name) {
        return this.getHttpServletResponse().containsHeader(name);
    }

    @Override
    public String encodedRedirectURL(String url) {
        return this.getHttpServletResponse().encodedRedirectURL(url);
    }

    @Override
    public String encodeURL(String url) {
        return this.getHttpServletResponse().encodeURL(url);
    }

    @Override
    public String getHeader(String name) {
        return this.getHttpServletResponse().getHeader(name);
    }

    @Override
    public Collection<String> getHeaderNames() {
        return this.getHttpServletResponse().getHeaderNames();
    }

    @Override
    public Collection<String> getHeaders(String name) {
        return this.getHttpServletResponse().getHeaders(name);
    }

    @Override
    public int getStatus() {
        return this.getHttpServletResponse().getStatus();
    }

    @Override
    public void sendError(int sc) {
        this.getHttpServletResponse().sendError(sc);
    }

    @Override
    public void sendError(int sc, String msg) {
        this.getHttpServletResponse().sendError(sc, msg);
    }

    @Override
    public void SendRedirect(String location) {
        this.getHttpServletResponse().SendRedirect(location);
    }

    @Override
    public void setDateHeader(String name, long date) {
        this.getHttpServletResponse().setDateHeader(name, date);
    }

    @Override
    public void setHeader(String name, String value) {
        this.getHttpServletResponse().setHeader(name, value);
    }

    @Override
    public void SetintHeader(String name, int value) {
        this.getHttpServletResponse().SetintHeader(name, value);
    }

    @Override
    public void setStatus(int sc) {
        this.getHttpServletResponse().setStatus(sc);
    }
}
