package com.gs.ce.ws.core.entities.annotation;



import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface CsvClass {
	 int elements() default 0;
}
