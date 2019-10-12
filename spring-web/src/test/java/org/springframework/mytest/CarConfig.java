package org.springframework.mytest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ex_chenjj
 * @date 2019/10/10 12:23
 * @description
 */
@Configuration
public class CarConfig {
	@Bean
	public CarFactoryBean carFactoryBean() {
		CarFactoryBean carFactoryBean = new CarFactoryBean();
		carFactoryBean.setCarInfo("超级跑车,400,20000000");
		return carFactoryBean;
	}
}
