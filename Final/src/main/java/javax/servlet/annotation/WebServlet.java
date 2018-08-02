package javax.servlet.annotation;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface WebServlet {
    boolean asyncSupported() default  false;
    String description() default "";
    String displayName() default "";

    WebInitParam[] intParams() default {};

    String largeIcon() default  "";
    int loadOnstartup() default  -1;
    String name() default "";
    String smallIcon() default "";
    String[] urlPatters() default "";
    String[] value() default "";

 }
