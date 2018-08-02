package javax.servlet.http;

public interface HttpUpgradeHandler {
    void destroy();
    void init(WebConnection wc);
}
