package javax.servlet.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(value = TYPE)
@Retention(value = RUNTIME)
public @interface MultipartConfig {

    int fileSizeThreshold() default 0;
    long maxRequestSize() default -1L;
    long maxFileSize() default -1L;
    String location() default "";
}
