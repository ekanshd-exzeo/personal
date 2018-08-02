package javax.servlet.annotation;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface WebInitParam {

    String name();

    String value();

    String descriptor() default "" ;
}
