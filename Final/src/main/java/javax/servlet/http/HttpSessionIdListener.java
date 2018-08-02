package javax.servlet.http;

import java.util.EventListener;

public interface HttpSessionIdListener extends EventListener {
    void SessionIdChanged(HttpSessionEvent event,String oldSessionId);
}
