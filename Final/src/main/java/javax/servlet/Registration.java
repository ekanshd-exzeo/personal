package javax.servlet;

import javax.accessibility.AccessibleText;
import java.util.Map;
import java.util.Set;

public interface Registration {

    interface RegistrationDynamic {
        void setAsyncSupported(boolean isAsyncSupported);
    }

    String getClassName();

    String getInitParameter(String name);

    Map<String, String> getInitParameters();

    String getName();

    boolean setInitParameter(String name, String value);

    Set<String> setInitParamets(Map<String, String> initParameters);
}
