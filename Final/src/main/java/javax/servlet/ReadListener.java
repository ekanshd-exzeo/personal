package javax.servlet;

import java.util.EventListener;

public interface ReadListener extends EventListener {
    void onAllDataRead();
    void onDataAvailable();
    void onError(Throwable t);
}
