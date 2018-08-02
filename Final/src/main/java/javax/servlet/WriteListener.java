package javax.servlet;

import java.util.EventListener;

public interface WriteListener extends EventListener {

    void onError(Throwable t);
    void onWritePossible();
}
