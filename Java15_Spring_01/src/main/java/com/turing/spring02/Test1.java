package com.turing.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 获取Spring容器中是实例
 * @author fred
 *
 */
public class Test1 {
	
	//还是有问题，没有解耦，有依赖

	public static void main(String[] args) {
		/**
		 * 实现IOC：控制反转
		 */
		//获取Spring容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/turing/spring02/config.xml");
		//从容器中获取Bean
		//第一种：通过类型查找
		//PinPrinter printer = ctx.getBean(PinPrinter.class);//根据类型查找
		//第二种：通过名称查找
		PinPrinter printer = (PinPrinter) ctx.getBean("pinPrinter2");
		//第三种：通过名称和类型查找
		//PinPrinter printer = ctx.getBean("pinPrinter", PinPrinter.class);
		//调用方法
		printer.print();
		//PinPrinter printer = new PinPrinter();
		/**
		 * 底层分析：
		 * 1、解析xml配置文件
		 * 2、Class clazz = Class.forName("com.turing.spring02.PinPrinter");
		 * 3、PinPrinter pinPrinter = clazz.newInstance();
		 */
	}

}
