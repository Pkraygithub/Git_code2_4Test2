package in.sbms.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sbms.Atm;

public class TestApps {	

	public static void main(String[] args) {

		ApplicationContext ctext = new ClassPathXmlApplicationContext("Ioc-bean.xml");
		
		Atm bean = ctext.getBean(Atm.class);
		bean.withdrow(3444);
	}

}
