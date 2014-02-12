package springtest;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thingnet.model.component.Human;

public class componentSpringTest extends TestCase{

	private ApplicationContext context;

	@Override
	protected void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("com/thingnet/model/component/componentContext.xml");
	}

	public void testComponetScan(){
		Human human = (Human)context.getBean("chenjunjie");
		System.out.println(human.toString());
	}
}
