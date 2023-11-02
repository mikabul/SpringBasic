package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.SamsungTV;
import kr.co.softsoldesk.beans.TV;
import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		/* 자바코드
		 * TestBean t1 = new TestBean(); t1.printData();
		 */
		System.out.println("========================================");
		TestBean obj1 = ctx.getBean("obj1", TestBean.class);
		obj1.printData();
		
		System.out.println("========================================");
		TestBean obj2 = ctx.getBean("obj2", TestBean.class);
		obj2.printData();
		
		System.out.println("========================================");
		TestBean obj3 = ctx.getBean("obj3", TestBean.class);
		obj3.printData();
		
		System.out.println("========================================");
		TestBean obj4 = ctx.getBean("obj4", TestBean.class);
		obj4.printData();
		
		System.out.println("========================================");
		TestBean obj5 = ctx.getBean("obj5", TestBean.class);
		obj5.printData();
		
		System.out.println("========================================");
		TestBean obj6 = ctx.getBean("obj6", TestBean.class);
		obj6.printData();
		
		System.out.println("========================================");
		TestBean obj7 = ctx.getBean("obj7", TestBean.class);
		obj7.printData();

		System.out.println("========================================");
		TestBean2 obj8 = ctx.getBean("obj8", TestBean2.class);
		obj8.printData();
		
		System.out.println("========================================");
		TestBean2 obj9 = ctx.getBean("obj9", TestBean2.class);
		obj9.printData();
		
		System.out.println("========================================");
		TV tv = ctx.getBean("tv", SamsungTV.class);
		tv.powerOn();
		tv.volumeUp();
		tv.powerOff();
		
		ctx.close();
	}

}
