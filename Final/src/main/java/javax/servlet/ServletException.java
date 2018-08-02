package javax.servlet;

public class ServletException extends Exception {
    ServletException(){
        System.out.print("Servlet Exception Occured");
    }

    public ServletException(String message){
        System.out.print("Servlet Exception Occured");
    }
    public ServletException(String message,Throwable rootCause){
        System.out.print("Servlet Exception Occured");
    }
    public ServletException(Throwable rootCause){
        System.out.print("Servlet Exception Occured");
    }

    public Throwable getRootCause(){
        return null;
    }
}
