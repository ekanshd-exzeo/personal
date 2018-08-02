package javax.servlet;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public interface ServletResponse {
    void flushBuffer();
    int getBUffersize();
    String getCharacterEncoding();
    String getContentType();
    Locale getLocale();
    ServletOutputStream getOutputStream();
    PrintWriter getWriter() throws UnsupportedEncodingException;
    boolean isCommited();
    void reset();
    void resetBuffer();
    void resetBufferSize(int size);
    void setcharacterEncoding(String charset);
    void setContentLength(int len);
    void setContentLengthLong(long len);
    void setLocale(Locale loc);
    void setContentType(String s);
}
