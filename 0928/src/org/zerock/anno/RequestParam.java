package org.zerock.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//파라미터에서만 사용하겠다고 지정해주는 것이다.
@Target({ ElementType.PARAMETER })
public @interface RequestParam {

	public String value();
}
