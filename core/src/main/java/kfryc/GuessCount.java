package kfryc;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})     //context in which the annotation is applicable
@Retention(RetentionPolicy.RUNTIME)         // how long the annotation types are to be retained
@Qualifier                                  // to annotate other annotations to be used by Spring
public @interface GuessCount {
}
