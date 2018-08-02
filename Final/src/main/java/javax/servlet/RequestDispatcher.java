package javax.servlet;

public interface RequestDispatcher {
    static String ERROR_EXCEPTION = "com.ekansh.Servlet.error.exception";
    static String ERROR_EXCEPTION_TYPE = "com.ekansh.servlet.error.exception_type";
    static String ERROR_MESSAGE = "com.ekansh.servlet.error.message";
    static String ERROR_REQUEST_URI = "com.ekansh.servlet.error.request_uri";
    static String ERROR_SERVLET_NAME = "com.ekansh.servlet.error.servlet_name";
    static String ERROR_STATUS_CODE = "com.ekansh.servlet.error.status_code";
    static String FORWARD_CONTEXT_PATH = "com.ekansh.servlet.forward.context_path";
    static String FORWARD_MAPPING = "com.ekansh.servlet.forward.mapping";
    static String FORWARD_PATH_INFO = "com.ekansh.servlet.forward.path_info";
    static String FORWARD_QUERY_STRING = "com.ekansh.servlet.forward.query_string";
    static String FORWARD_REQUEST_URI = "com.ekansh.servlet.forward.request_uri";
    static String FORWARD_SERVLET_PATH = "com.ekansh.servlet.forward.servlet_path";
    static String INCLUDE_CONTEXT_PATH = "com.ekansh.servlet.include.context_path";
    static String INCLUDE_MAPPING = "com.ekansh.servlet.include.mapping";
    static String INCLUDE_PATH_INFO = "com.ekansh.servlet.include.path_info";
    static String INCLUDE_QUERY_STRING = "com.ekansh.servlet.include.query_string";
    static String INCLUDE_REQUEST_URI = "com.ekansh.servlet.include.request_uri";
    static String INCLUDE_SERVLET_PATH = "com.ekansh.servlet.imclude.servlet_path";

    void forward(ServletRequest request,ServletResponse response);
    void include(ServletRequest request,ServletResponse response);

}
