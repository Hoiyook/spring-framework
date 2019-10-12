package org.springframework.mytest;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author ex_chenjj
 * @date 2019/10/10 12:25
 * @description
 */
public class Client {

	@Resource
	private CarFactoryBean carFactoryBean;

	@Test
	public void methodA() throws Exception {
		Car car = carFactoryBean.getObject();
		System.out.println(car.toString());
	}
}
