package javax.servlet.http;

import java.io.InputStream;
import java.util.Collection;

public interface Part {

    void delete();
    String getContentType();
    String getHeader(String name);
    Collection<String> getHeaferNames();
    Collection<String> getHeaders(String name);
    InputStream getInputStream();
    String getName();
    long getSize();
    String getSubmittedFileName();
    void write(String Filename);
}
