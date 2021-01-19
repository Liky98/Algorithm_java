package Spring_Test00001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		//TransportationWalk transportationWalk = new TransportationWalk();
		//transportationWalk.move();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk transportationwalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationwalk.move();
		
		ctx.close();
		
	
	}
}
