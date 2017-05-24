package govopendata.dataset.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
	}
}
