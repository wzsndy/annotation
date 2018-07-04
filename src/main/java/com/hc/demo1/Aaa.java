package com.hc.demo1;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Aaa {
	
	public Class<?> name() default int.class;
	public String[] str() default {"1", "aaa"};
	public String[] value();
	public int max() default 1000;
}
