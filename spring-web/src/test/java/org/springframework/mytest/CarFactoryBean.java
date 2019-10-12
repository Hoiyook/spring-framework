package org.springframework.mytest;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author ex_chenjj
 * @date 2019/10/10 12:18
 * @description
 */
public class CarFactoryBean implements FactoryBean<Car> {
	private String carInfo;

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		String[] infos = carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.valueOf(infos[1]));
		car.setPrice(Double.valueOf(infos[2]));
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	public boolean isSingleton() {
		return false;
	}

	public String getCarInfo() {
		return this.carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
}
