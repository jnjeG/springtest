package springtest;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thingnet.model.aspect.Magician;
import com.thingnet.model.aspect.Performer;
import com.thingnet.model.aspect.Volunteer;
import com.thingnet.model.aspect.introduce.ExtendInterface;

public class aspectSpringTest extends TestCase{

	private ApplicationContext context;

	@Override
	protected void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("com/thingnet/model/aspect/aspectContext.xml");
	}

	public void testAspect(){
		Performer performer = (Performer)context.getBean("performer2");
//		Performer performer = new Performer();
		performer.perform();
	}
	
	/**
	 * 测试拦截参数
	 */
	public void testArgIntercept(){
		Magician magician = (Magician)context.getBean("magician");
		Volunteer volunteer = (Volunteer)context.getBean("volunteer");
		volunteer.thinkOfSomething("hello my lady..");
		
		assertEquals(magician.getThoughts(), volunteer.getMythought());
	}
	
	/**
	 * 测试引入功能
	 */
	public void testIntroduce(){
		ExtendInterface ext =  (ExtendInterface)context.getBean("origin");
		ext.extend();
	}
	
	/**
	 * 测试注解版的引入机制
	 */
	public void testIntroduceAnnotation(){
		ExtendInterface ext =  (ExtendInterface)context.getBean("origin2");
		ext.extend();
	}
}
