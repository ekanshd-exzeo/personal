package javax.servlet.http;

public class HttpSessionBindingEvent extends HttpSessionEvent{
    private String name;
    private Object value;

    HttpSessionBindingEvent(HttpSession session,String name){

        super(session);
        this.name = name;
    }
    HttpSessionBindingEvent(HttpSession session,String name,Object value){

        super(session);
    this.name = name;
    this.value =value;
    }

    String getName(){
        return name;
    }

    public HttpSession getSession(){

        return super.getSession();
    }

    Object getValue(){
        return value;
    }
}
