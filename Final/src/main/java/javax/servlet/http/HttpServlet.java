package javax.servlet.http;

import javax.servlet.*;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class HttpServlet extends GenericServlet {

    private static final String METHOD_DELETE = "DELETE";
    private static final String METHOD_HEAD = "HEAD";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_OPTIONS = "OPTIONS";
    private static final String METHOD_POST = "POST";
    private static final String METHOD_PUT = "PUT";
    private static final String METHOD_TRACE = "TRACE";

    private static final String HEADER_IFMODSINCE = "If-Modified-Since";
    private static final String HEADER_LASTMOD = "Last-Modified";

    public HttpServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Protocol = request.getProtocol();
        if (Protocol.endsWith("1.1")) {
            response.sendError(HttpServletResponse.SC_NOT_ALLOWED, HttpServletResponse.GET_NOT_SUPPORTED);
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, HttpServletResponse.GET_NOT_SUPPORTED);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Protocol = request.getProtocol();
        if (Protocol.endsWith("1.1")) {
            response.sendError(HttpServletResponse.SC_NOT_ALLOWED, HttpServletResponse.POST_NOT_SUPPORTED);
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, HttpServletResponse.POST_NOT_SUPPORTED);
        }
    }

    protected void doput(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Protocol = request.getProtocol();
        if (Protocol.endsWith("1.1")) {
            response.sendError(HttpServletResponse.SC_NOT_ALLOWED, HttpServletResponse.PUT_NOT_SUPPORTED);
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, HttpServletResponse.PUT_NOT_SUPPORTED);
        }
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Protocol = request.getProtocol();
        if (Protocol.endsWith("1.1")) {
            response.sendError(HttpServletResponse.SC_NOT_ALLOWED, HttpServletResponse.DELETE_NOT_SUPPORTED);
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, HttpServletResponse.DELETE_NOT_SUPPORTED);
        }
    }

    protected long getLastModified(HttpServletRequest request) {
        return -1;
    }

    protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String method = request.getMethod();

  /*  boolean ALLOW_GET = false;
    boolean ALLOW_HEAD = false;
    boolean ALLOW_POST = false;
    boolean ALLOW_PUT = false;
    boolean ALLOW_DELETE = false;
    boolean ALLOW_TRACE = true;
    boolean ALLOW_OPTIONS = true;
*/
        StringBuilder allow = new StringBuilder();




        /* ALLOW_GET = methodName.equals("doGet") ? true : false;
        ALLOW_HEAD = methodName.equals("doGet") ? true : false;
        ALLOW_POST = methodName.equals("doPost") ? true : false;
        ALLOW_PUT = methodName.equals("doPut") ? true : false;
        ALLOW_DELETE = methodName.equals("doDelete") ? true : false;

        switch(method){
        case "GET" : allo;
        break;}

    */
        if (method.equals("GET")) {
            allow.append(METHOD_GET);
        } else if (method.equals("HEAD")) {
            allow.append(METHOD_HEAD);
        } else if (method.equals("PUT")) {
            allow.append(METHOD_PUT);
        } else if (method.equals("DELETE")) {
            allow.append(METHOD_DELETE);
        } else if (method.equals("TRACE")) {
            allow.append(METHOD_TRACE);
        } else if (method.equals("OPTIONS")) {
            allow.append(METHOD_OPTIONS);
        }
        response.setHeader("Allow", new String(allow));

    }



   /* private Method[] getAllDeclaredMethods(Class<? extends HttpServlet> aClass) {
        Class<?> clas = aClass;
        Method[] allMethods = null;

        while (clas.equals(HttpServlet.class)){
            Method[] thismethods = clas.getDeclaredMethods();
            if (allMethods != null && allMethods.length>0){
                Method[] subClassMethods = allMethods;
                allMethods = new Method[thismethods.length+subClassMethods.length];
                System.arraycopy(thismethods,thismethods.length,allMethods,allMethods.length,thismethods.length);
                System.arraycopy(subClassMethods,subClassMethods.length,allMethods,allMethods.length,subClassMethods.length);
            }else{
                allMethods = thismethods;
            } clas=clas.getSuperclass();
        }
        return ((allMethods != null) ? allMethods : new Method[0]);
    } */

    protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int responselength;
        String CRLF = "\r\n";
        StringBuilder buffer = new StringBuilder("TRACE");

        while (request.getHeaderNames().hasMoreElements()) {

            String header = new String(String.valueOf((request.getHeaderNames()).nextElement()));
            buffer.append(CRLF);
            buffer.append(header);
            buffer.append(" ");
            buffer.append(request.getHeader(header));
        }

        responselength = buffer.length();
        response.setContentType("message/http");
        response.setContentLength(responselength);
        ServletOutputStream out = response.getOutputStream();
        out.print(buffer.toString());
        out.close();
    }

    protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (DispatcherType.INCLUDE.equals(request.getDispatcherType())) {
            doGet(request, response);
        } else {

            NoBodyResponse res = new NoBodyResponse(response);
            doGet(request, res);
            res.setContentLength();
        }
    }


    private void maybeSetLastModified(HttpServletResponse resp,
                                      long lastModified) {
        if (resp.containsHeader(HEADER_LASTMOD))
            return;
        if (lastModified >= 0)
            resp.setDateHeader(HEADER_LASTMOD, lastModified);
    }


    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String method = request.getMethod();

        if (method.equals(METHOD_GET)) {
            long lastmodified = getLastModified(request);
            if (lastmodified == -1) {
                doGet(request, response);
            } else {
                long ifModifiedSince;
                try {
                    ifModifiedSince = request.getDateHeader(HEADER_IFMODSINCE);
                } catch (IllegalArgumentException ia) {
                    ifModifiedSince = -1;
                }
                if (ifModifiedSince < (lastmodified / 1000 * 1000)) {
                    maybeSetLastModified(response, lastmodified);
                    doGet(request, response);
                } else {
                    response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
                }
            }
        } else if (method.equals(METHOD_HEAD)) {
            long lastmodified = getLastModified(request);
            maybeSetLastModified(response, lastmodified);
            doHead(request, response);
        } else if (method.equals(METHOD_PUT)) {
            doPost(request, response);
        } else if (method.equals(METHOD_POST)) {
            doput(request, response);
        } else if (method.equals(METHOD_DELETE)) {
            doDelete(request, response);
        } else if (method.equals(METHOD_OPTIONS)) {
            doOptions(request, response);
        } else if (method.equals(METHOD_TRACE)) {
            doTrace(request, response);
        } else {

            String error = "Http method not implemented";
            response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, error);
        }

    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        HttpServletRequest request;
        HttpServletResponse response;

        try {
            request = (HttpServletRequest) req;
            response = (HttpServletResponse) res;
        } catch (ClassCastException c) {
            throw new ServletException("non HTTP request or response");
        }

        service(request, response);
    }

    class NoBodyResponse extends HttpServletResponseWrapper {

        private final NoBodyOutputStream noBodyResponse;
        private PrintWriter writer;
        private boolean didsetcontentlength;

        public NoBodyResponse(HttpServletResponse response) {
            super(response);
            noBodyResponse = new NoBodyOutputStream();
        }

        void setContentLength() {
            if (!didsetcontentlength) {
                if (writer != null) {
                    writer.flush();
                }
                super.setContentLength(noBodyResponse.getContentLength());
            }
        }


        @Override
        public void setContentLength(int len) {
            super.setContentLength(len);
            didsetcontentlength = true;
        }

        @Override
        public void setHeader(String name, String value) {
            super.setHeader(name, value);
        }

        @Override
        public void addHeader(String name, String value) {
            super.addHeader(name, value);
        }

        @Override
        public void SetintHeader(String name, int value) {
            super.SetintHeader(name, value);
            checkHeader(name);
        }

        @Override
        public void addIntHeader(String name, int value) {
            super.addIntHeader(name, value);
            checkHeader(name);
        }

        private void checkHeader(String name) {
            if ("content-length".equalsIgnoreCase(name)) {
                didsetcontentlength = true;
            }
        }

        @Override
        public ServletOutputStream getOutputStream() {
            return noBodyResponse;
        }

        @Override
        public PrintWriter getWriter() throws UnsupportedEncodingException {

            if (writer == null) {
                OutputStreamWriter w;
                try {
                    w = new OutputStreamWriter(noBodyResponse, getCharacterEncoding());
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedEncodingException("Encoding Exception Occurred");
                }
                writer = new PrintWriter(w);
            }
            return writer;
        }


    }


    class NoBodyOutputStream extends ServletOutputStream {

        private int contentLength = 0;

        NoBodyOutputStream() {

        }


        int getContentLength() {
            return contentLength;
        }

        @Override
        public boolean isReady() {
            return false;
        }

        @Override
        public void setWriteListener(WriteListener writeListener) {

        }

        @Override
        public void write(int b) throws IOException {
            contentLength++;
        }

        @Override
        public void write(byte buf[], int offset, int len) throws IOException {
            if (buf == null) {
                throw new NullPointerException(" nullArray exception");
            }

            if (offset < 0 || len < 0 || offset + len > buf.length) {
                throw new IndexOutOfBoundsException("Index out of Bound Exception Occurred");
            }

            contentLength += len;
        }

    }

}
