package javax.servlet.http;

import java.util.Set;

public interface PushBuilder {
    PushBuilder addHeader(String name,String value);
    String getHeader(String name);
    Set<String> getHeaderNames();
    String getMethod();
    String getPath();
    String getQueryString();
    String getSessionId();
    PushBuilder method(String method);
    PushBuilder path(String path);
    void push();
    PushBuilder queryString(String queryString);
    PushBuilder removeHeader(String name);
    PushBuilder sessionId(String sessionId);
    PushBuilder setHeader(String name,String value);
}
