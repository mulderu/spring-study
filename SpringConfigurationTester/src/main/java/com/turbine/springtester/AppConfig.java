package com.turbine.springtester;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * springframework4 annotation Configure를 이용하여 설정을 이용해 본다.
 * 
 * @author mulder
 *
 */
@Configuration
@PropertySource("classpath:/com/turbine/springtester/app.properties")
public class AppConfig {
	
	@Value("${db.name}") private String dbName;
	
	private int _cnt = 0;
	
	/**
	 * @PropertySource 를 사용하기 위하여 아래를 추가 한다.
	 * 
	 * @return
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
	}
	
	/**
	 * Test Bean 을 만들어 준다.
	 * 
	 * @return
	 */
	@Bean
	public Mulder getMulder() {
		Mulder mulder = new Mulder();

		_cnt++;
		
		mulder.setAge(BigInteger.valueOf(1000));
		mulder.setGood("goodddd");
		mulder.setName("hiMulder_" + _cnt + "_" + dbName);
		
		return mulder;
	}
	

}
