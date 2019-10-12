package org.springframework.mytest;

/**
 * @author ex_chenjj
 * @date 2019/10/10 12:17
 * @description
 */
public class Car {
	private int maxSpeed;
	private String brand;
	private double price;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" +
				"maxSpeed=" + maxSpeed +
				", brand='" + brand + '\'' +
				", price=" + price +
				'}';
	}
}
