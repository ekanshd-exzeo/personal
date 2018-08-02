package javax.servlet.annotation;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ServletSecurity {

    HttpMethodConstraint[] httpMethodConstraints() default { };


    HttpConstraint value() default @HttpConstraint;

    public static enum TransportGuarantee {
        NONE,
        CONFIDENTIAL;


    }

    public static enum EmptyRoleSemantic {
        PERMIT,
        DENY;

    }
}
