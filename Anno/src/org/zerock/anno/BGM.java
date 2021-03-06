package org.zerock.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//타입과 메소드에서 사용하겠다고 지정해주는 코드이다.
@Target({ElementType.TYPE, 
	     ElementType.METHOD })
public @interface BGM {

	
	String value();
	int duration() default 30;
	
}
