package com.turing.spring04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Configuration等同于一个空的config.xml
 * @ComponentScan等同于<context:component-scan>
 * 默认扫描当前类所在包及其子包
 * @author fred
 *
 */
@Configuration
@ComponentScan
public class MainTest {

	public static void main(String[] args) {
		//获取Spring容器对象
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainTest.class);
		//从容器中获取图文店
		PrintHouse printHouse = ctx.getBean(PrintHouse.class);
		//调用图文店的方法
		printHouse.service();
	}

}
