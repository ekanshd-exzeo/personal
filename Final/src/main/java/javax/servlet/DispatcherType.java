package javax.servlet;


/**
 *
 */
public enum DispatcherType {
    ASYNC,
    ERROR,
    FORWARD,
    INCLUDE,
    REQUEST;

    static DispatcherType valueof(String name) {
        if (name.equals(DispatcherType.ASYNC)) {
            return DispatcherType.ASYNC;
        }
        if (name.equals(DispatcherType.ERROR)) {
            return DispatcherType.ERROR;
        }
        if (name.equals(DispatcherType.FORWARD)) {
            return DispatcherType.FORWARD;
        }
        if (name.equals(DispatcherType.INCLUDE)) {
            return DispatcherType.INCLUDE;
        }
        if (name.equals(DispatcherType.REQUEST)) {
            return DispatcherType.REQUEST;
        } else
            return null;
    }

    static DispatcherType[] Values() {
        int i = 0;
        DispatcherType[] m;
        m = new DispatcherType[5];
        {
            for (DispatcherType c : DispatcherType.values())
                m[i] = c;
            i++;
        }
        return m;
    }

}
