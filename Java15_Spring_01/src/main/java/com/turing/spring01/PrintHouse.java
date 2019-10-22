package com.turing.spring01;
/**
 * 图文店
 * @author fred
 *
 */
public class PrintHouse{

	//依赖打印机
	private Printer printer;
	
	public PrintHouse() {
		//赋值打印机的实例化工作
		//产生了依赖PrintHouse
		printer = new PinPrinter();
	}
	
	//提供服务
	public void service() {
		printer.print();
	}
	
	public static void main(String[] args) {
		//创建图文店对象
		PrintHouse printHouse = new PrintHouse();
		//提供服务
		printHouse.service();
	}
}
