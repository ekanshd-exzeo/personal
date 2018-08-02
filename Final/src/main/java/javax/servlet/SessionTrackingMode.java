package javax.servlet;

public enum SessionTrackingMode {
    COOKIE,
    SSL,
    URL,
    ERROR;


    static SessionTrackingMode[] Values() {

        int i = 0;
        SessionTrackingMode[] m;
        m = new SessionTrackingMode[3];
        {
            for (SessionTrackingMode c : SessionTrackingMode.values())
                m[i] = c;
            i++;
        }
        return m;

    }


    static SessionTrackingMode ValueOf(String name) {

        if (name.equals(SessionTrackingMode.COOKIE)) {
            return SessionTrackingMode.COOKIE;
        }
        if (name.equals(SessionTrackingMode.SSL)) {
            return SessionTrackingMode.SSL;
        }
        if
                (name.equals(SessionTrackingMode.URL)) {
            return SessionTrackingMode.URL;
        } else
            return SessionTrackingMode.ERROR;
    }
}
