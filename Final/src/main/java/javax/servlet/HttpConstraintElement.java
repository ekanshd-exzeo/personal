package javax.servlet;

import javax.servlet.annotation.ServletSecurity;

public class HttpConstraintElement  {

    private  final ServletSecurity.EmptyRoleSemantic emptyRoleSemantic;
    private  final ServletSecurity.TransportGuarantee transportGuarantee;
    private final String[] rolesAllowed;


    public HttpConstraintElement(){
        this.emptyRoleSemantic = ServletSecurity.EmptyRoleSemantic.PERMIT;
        this.transportGuarantee = ServletSecurity.TransportGuarantee.NONE;
        this.rolesAllowed = new String[0];
    }

    public HttpConstraintElement(ServletSecurity.EmptyRoleSemantic semantic) {
        this.emptyRoleSemantic =semantic;
        this.transportGuarantee = ServletSecurity.TransportGuarantee.NONE;
        this.rolesAllowed = new String[0];
    }

    public HttpConstraintElement(ServletSecurity.TransportGuarantee guarantee, String... roleNames){

        this.rolesAllowed = roleNames;
        this.transportGuarantee = guarantee;
        this.emptyRoleSemantic = ServletSecurity.EmptyRoleSemantic.PERMIT;
    }

    public HttpConstraintElement(ServletSecurity.EmptyRoleSemantic semantic, ServletSecurity.TransportGuarantee guarantee, String... roleNames){

        if (roleNames != null && roleNames.length >0 && ServletSecurity.EmptyRoleSemantic.DENY.equals(semantic)){
            throw new IllegalArgumentException(" Invalid ROLES DENY");
        }
        this.rolesAllowed =roleNames;
        this.emptyRoleSemantic = semantic;
        this.transportGuarantee =guarantee;
    }

    public ServletSecurity.EmptyRoleSemantic getEmptyRoleSemantic(){

        return this.emptyRoleSemantic;
    }

    public String[] getRolesAllowed(){
        return rolesAllowed;
    }

    public ServletSecurity.TransportGuarantee getTransportGuarantee(){
        return transportGuarantee;
    }


}

