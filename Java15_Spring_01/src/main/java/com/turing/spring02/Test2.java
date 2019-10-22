package com.turing.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 获取Spring容器中是实例
 * @author fred
 *
 */
public class Test2 {
	
	//使用接口，去掉依赖

	public static void main(String[] args) {
		/**
		 * 实现IOC：控制反转
		 */
		//获取Spring容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/turing/spring02/config.xml");
		//从容器中获取Bean
		//Printer printer = ctx.getBean(Printer.class);
		//Printer printer = (Printer) ctx.getBean("pinPrinter2");
		Printer printer = ctx.getBean("pinPrinter2",Printer.class);
		//调用接口方法
		printer.print();
	}

}
