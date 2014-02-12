package springtest;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thingnet.model.configuration.Foot;

public class configurationSpringTest extends TestCase{

	private ApplicationContext context;

	@Override
	protected void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("com/thingnet/model/configuration/configurationContext.xml");
	}

	public void testConfig(){
		Foot leg = (Foot)context.getBean("cjjLeg");
		System.out.println(leg.toString());
	}
}
