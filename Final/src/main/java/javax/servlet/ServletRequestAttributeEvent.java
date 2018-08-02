package javax.servlet;

public class ServletRequestAttributeEvent extends ServletRequestEvent {
    private final String name;
    private final Object value;

    public ServletRequestAttributeEvent(ServletContext sc,ServletRequest request,String name , Object value){
super(sc, request);
this.name=name;
this.value=value;

    }

    String getName() {
        return this.name;
    }

    Object getValue(){
        return this.value;
    }
}
