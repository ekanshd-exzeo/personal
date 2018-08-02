package javax.servlet;

public interface SessionCookieConfig {

    String getComment();
    String getDomain();
    int getMaxage();
    String getName();
    String getPath();
    String isHttpOny();
    boolean isSecure();
    void setComment(String comment);
    void setDomain(String domain);
    void setHttpOnly(boolean httpOnly);
    void setMaxAge(int maxAge);
    void setName(String name);
    void setPath(String path);
    void setSecure(boolean secure);

}
