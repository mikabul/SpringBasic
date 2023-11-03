package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.SamsungTV;
import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");

		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t1.data2 : %f\n", t1.getData2());
		System.out.printf("t1.data3 : %s\n", t1.isData3());
		System.out.printf("t1.data4 : %s\n", t1.getData4());
		System.out.printf("t1.data5 : %s\n", t1.getData5());
		System.out.printf("t1.data6 : %s\n", t1.getData6());

		//활용
		SamsungTV stv = ctx.getBean("tv", SamsungTV.class);
		stv.powerOn();
		stv.volumeUp();
		stv.volumeDown();
		stv.getSpeaker();
		stv.getPrice();
		stv.powerOff();
		ctx.close();
	}

}
