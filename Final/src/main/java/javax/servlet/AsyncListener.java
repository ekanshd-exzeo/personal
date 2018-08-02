package javax.servlet;

import java.util.EventListener;

public interface AsyncListener extends EventListener {
    public void onComplete(AsyncEvent event);
    public void onError(AsyncEvent event);
    public void onStartAsync (AsyncEvent event);
    public void onTimeout (AsyncEvent event);
}
