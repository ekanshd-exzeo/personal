package javax.servlet.http;

import javax.servlet.ServletResponse;

import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

public interface HttpServletResponse extends ServletResponse {

    static int SC_ACCEPTED = 202;
    static int SC_BAD_GATEWAY = 502;
    static int SC_BAD_REQUEST = 400;
    static int SC_CONFLICT = 409;
    static int SC_CONTINUE = 100;
    static int SC_CREATED = 201;
    static int SC_EXPECTATION_FAILED = 417;
    static int SC_FORBIDDEN = 403;
    static int SC_FOUND = 302;
    static int SC_NOT_FOUND = 404;
    static int SC_NOT_IMPLEMENTED = 501;
    static int SC_NOT_MODIFIED = 304;
    static int SC_OK = 200;
    static int SC_PARTIAL_CONTENT = 206;
    static int SC_PAYMENT_REQUIRED = 402;
    static int SC_PRECONDITION_FAILED = 412;
    static int SC_PROXY_AUTHENTICATION_REQUIRED = 407;
    static int SC_REQUEST_ENTITY_TOO_LARGE = 413;
    static int SC_REQUEST_TIMEOUT = 408;
    static int SC_REQUEST_URI_TOO_LONG = 414;
    static int SC_REQUEST_RANGE_NOT_SATISFIABLE = 416;
    static int SC_RESET_CONTENT = 205;
    static int SC_SEE_OTHER = 303;
    static int SC_SERVICE_UNAVAILABLE = 503;
    static int SC_SWITCHING_PROTOCOLS = 101;
    static int SC_TEMPORARY_REDIRECT = 307;
    static int SC_UNAUTHORIZED = 401;
    static int SC_UNSUPPORTED_MEDIA_TYPE = 415;
    static int SC_USE_PROXY = 305;
    static int SC_NOT_ALLOWED = 405;

    static String GET_NOT_SUPPORTED = " Http method GET not supported";
    static String POST_NOT_SUPPORTED = " Http method POST not supported";
    static String PUT_NOT_SUPPORTED = " Http method PUT not supported";
    static String DELETE_NOT_SUPPORTED = " Http method DELETE not supported";

    void addCookie(Cookie cookie);

    void addDateHeader(String name, long date);

    void addHeader(String name, String value);

    void addIntHeader(String name, int value);

    boolean containsHeader(String name);

    String encodedRedirectURL(String url);

    String encodeURL(String url);

    String getHeader(String name);

    Collection<String> getHeaderNames();

    Collection<String> getHeaders(String name);

    int getStatus();

    default Supplier<Map<String, String>> getTrailerFields() {
        return null;
    }

    void sendError(int sc);

    void sendError(int sc, String msg);

    void SendRedirect(String location);

    void setDateHeader(String name, long date);

    void setHeader(String name, String value);

    void SetintHeader(String name, int value);

    void setStatus(int sc);

    default void setTrailerFields(Supplier<Map<String, String>> supplier) {

    }

}
