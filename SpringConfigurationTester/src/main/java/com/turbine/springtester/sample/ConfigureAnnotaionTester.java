package com.turbine.springtester.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.turbine.springtester.AppConfig;
import com.turbine.springtester.Mulder;


public class ConfigureAnnotaionTester {
	
	public static void main (String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
	    ctx.register(AppConfig.class);
	    ctx.refresh();
	    Mulder mulder = ctx.getBean(Mulder.class);
			 
		System.out.println ("XTest ----" + mulder.getName() );
		
		Mulder mulder2 = ctx.getBean(Mulder.class);
		 
		System.out.println ("XTest ----" + mulder2.getName() );

	}

}
