package com.turbine.springtester.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.turbine.springtester.AppConfig;
import com.turbine.springtester.Mulder;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class ConfigureJUnitTester {
	@Autowired
	public Mulder mulder;
	
	@Test
	public void Test01 () {
		System.out.println ("Test01 ----" + mulder.getName() );
	}
	
	@Test
	public void Test02 () {
		System.out.println ("Test02 ----" + mulder.getName() );
	}

}
