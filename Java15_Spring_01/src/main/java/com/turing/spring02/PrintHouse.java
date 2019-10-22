package com.turing.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 图文店
 * DI:属性注入
 * @author fred
 *
 */
public class PrintHouse{

	//属性
	private Printer printer;
	
	//设置属性
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	//提供服务
	public void service() {
		printer.print();
	}
	
	public static void main(String[] args) {
		//获取Spring容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/turing/spring02/config.xml");
		//从容器中获取图文店
		PrintHouse printHouse = ctx.getBean(PrintHouse.class);
		//调用图文店的方法
		printHouse.service();
	}
}
