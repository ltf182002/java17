package com.turing.spring03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 图文店
 * DI:属性注入
 * @author fred
 *
 */

/**
 * @Component：就是IOC
 * @author fred
 *
 */
@Component
public class PrintHouse{

	//属性
	/**
	 * @Autowired:就是DI
	 */
	@Autowired
	//当类型冲突的时候，可以给该接口类型取一个限定名
	@Qualifier("laserPrinter")
	private Printer printer;
	
	//设置属性
	//set方法可以省略不写
//	public void setPrinter(Printer printer) {
//		this.printer = printer;
//	}
	
	//提供服务
	public void service() {
		printer.print();
	}
	
	public static void main(String[] args) {
		//获取Spring容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/turing/spring03/config.xml");
		//从容器中获取图文店
		PrintHouse printHouse = ctx.getBean(PrintHouse.class);
		//调用图文店的方法
		printHouse.service();
	}
}
