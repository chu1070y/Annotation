package org.zerock.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, 
	     ElementType.METHOD })
public @interface BGM {

	
	String value();
	int duration() default 30;
	
}
