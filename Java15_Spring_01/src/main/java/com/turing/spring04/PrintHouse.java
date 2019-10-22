package com.turing.spring04;

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

@Component
public class PrintHouse{

	@Autowired
	@Qualifier("laserPrinter")
	private Printer printer;
	
	//提供服务
	public void service() {
		printer.print();
	}
}
