package javax.servlet;

public class HttpMethodConstraintElement extends HttpConstraintElement {

    private final String methodname;
    public HttpMethodConstraintElement(String methodname){
        if(methodname==null || methodname.length()==0){
            throw new IllegalArgumentException("method name cant be null");
        }
        this.methodname=methodname;
    }

    public HttpMethodConstraintElement(String methodname, HttpMethodConstraintElement constraint){
        super(constraint.getEmptyRoleSemantic(), constraint.getTransportGuarantee(),constraint.getRolesAllowed());
        if(methodname==null || methodname.length()==0){
            throw new IllegalArgumentException("method name cant be null");
        }
        this.methodname=methodname;
    }

    public String getMethodname() { return methodname;}
}
