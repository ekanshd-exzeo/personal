package javax.servlet.annotation;
import java.lang.Class;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(value = TYPE)
@Retention(value = RUNTIME)
public @interface HandleTypes {
    Class<?>[] value();
}
