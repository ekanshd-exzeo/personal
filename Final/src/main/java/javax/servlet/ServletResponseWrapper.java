package javax.servlet;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class ServletResponseWrapper extends Object implements ServletResponse {
    private ServletResponse response;

    public ServletResponseWrapper(ServletResponse response) {
        if (response == null) {
            throw new IllegalArgumentException("RESPONSE cant be Null");
        }
        this.response = response;
    }
    public void setResponse(ServletResponse response){
        if (response == null) {
            throw new IllegalArgumentException("RESPONSE cant be Null");
        }
        this.response = response;
    }

    public ServletResponse getResponse(){

       return this.response;
    }

    @Override
    public void flushBuffer() {
        this.response.flushBuffer();
    }

    @Override
    public int getBUffersize() {
        return this.response.getBUffersize();
    }

    @Override
    public String getCharacterEncoding() {
        return this.response.getCharacterEncoding();
    }

    @Override
    public String getContentType() {
        return this.response.getContentType();
    }

    @Override
    public Locale getLocale() {
        return this.response.getLocale();
    }

    @Override
    public ServletOutputStream getOutputStream() {
        return this.response.getOutputStream();
    }

    @Override
    public PrintWriter getWriter() throws UnsupportedEncodingException {
        return this.response.getWriter();
    }

    @Override
    public boolean isCommited() {
        return this.response.isCommited();
    }

    @Override
    public void reset() {
        this.response.reset();
    }

    @Override
    public void resetBuffer() {
        this.response.resetBuffer();
    }

    @Override
    public void resetBufferSize(int size) {
        this.response.resetBufferSize(size);
    }

    @Override
    public void setcharacterEncoding(String charset) {
        this.response.setcharacterEncoding(charset);
    }

    @Override
    public void setContentLength(int len) {
    this.response.setContentLength(len);
    }

    @Override
    public void setContentLengthLong(long len) {
    this.response.setContentLengthLong(len);
    }

    @Override
    public void setLocale(Locale loc) {
    this.response.setLocale(loc);
    }

    @Override
    public void setContentType(String s) {
    this.setContentType(s);
    }

    public boolean isWrapperFor(ServletResponse wrapped){
        if(response == wrapped){
            return true;
        }
    if (response instanceof ServletResponseWrapper){
        return ((ServletResponseWrapper) response).isWrapperFor(wrapped);
    }
    return false;
}

    public boolean isWrapperFor(Class<?> wrappedType)
    {
        if(wrappedType.isAssignableFrom(response.getClass())){
            return true;
        }
        if (response instanceof ServletResponseWrapper){
            return ((ServletResponseWrapper) response).isWrapperFor(wrappedType);
        }
        return false;

    }


}


