package edu.itstep.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.SOURCE) // Не зберігається після компіляції
//@Retention(RetentionPolicy.CLASS) // Не зберігається в процесі виконання
@Retention(RetentionPolicy.RUNTIME) // Не зберігається в процесі виконання
@Target({ElementType.LOCAL_VARIABLE, ElementType.METHOD})
public @interface Group {
    String value();

    String description() default "";
}
