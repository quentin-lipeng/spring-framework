package org.springframework.demo.service;

public class HelloService implements HelloServiceI {
	@Override
	public void sayHello() {
		System.out.println("hello!!!");
	}
}
