package javax.servlet;

public interface AsyncContext {
    String ASYNC_CONTEXT_PATH = "java.servlet.async.context_path";
    String ASYNC_MAPPING = "java.servlet.async.mapping";
    String ASYNC_PATH_INFO ="java.servlet.async.path_info";
    String ASYNC_QUERY_STRING = "java.servlet.async.query_string";
    String ASYNC_REQUEST_URI = "java.servlet.async.request_uri";
    String ASYNC_SERVLET_PATH = "java.servlet.async.servlet_path";

    public void addListener(AsyncListener listener);
    public void addListener(AsyncListener listener,ServletRequest servletRequest,ServletResponse servletResponse);
    public void complete();
    public <T extends AsyncListener> T createListener(Class<T> clas);
    public void dispatch();
    public void dispatch(ServletContext context,String path);
    public void dispatch(String path);
    public ServletRequest getRequest();
    public ServletResponse getResponse();
    public long getTimeout();
    public boolean hasOrignalRequestAndResponse();
    public void setTimeout(long timeout);
    public void start(Runnable run);


}
