package springtest;

import junit.framework.TestCase;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thingnet.model.ConstructorArg;
import com.thingnet.model.Juggler;
import com.thingnet.model.MyConstructor;

public class springTest extends TestCase{

	private ApplicationContext context;

	@Override
	protected void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("com/thingnet/model/springContext.xml");
	}

	@Test
	public void testBean1(){
		ConstructorArg my =(ConstructorArg) context.getBean("myconstruct");
		my.setAge(1);
		MyConstructor cache = (MyConstructor)context.getBean("knight");
		System.out.println(cache.getMy().getAge());
	}
	
	@Ignore
	public void testAop(){
		MyConstructor cache = (MyConstructor)context.getBean("knight");
		cache.getMy().say();
	}
	
	public void testJuggler(){
		Juggler juggler = (Juggler)context.getBean("juggler");
		juggler.perform();
	}
	
	public void testFactoryMethod(){
		Juggler juggle = (Juggler)context.getBean("staticJuggle");
		juggle.perform();
	}
	
	
	public void testPropertyInject(){
		Juggler juggle= (Juggler)context.getBean("propertyjuggler");
		juggle.perform();
	}
	
	public void testCollectionProperty(){
		Juggler juggle= (Juggler)context.getBean("propertyjuggler");
		System.out.println(juggle.getWifesname());
	}
	
	public void testMapProperty(){
		Juggler juggle= (Juggler)context.getBean("propertyjuggler");
		System.out.println(juggle.getJugglemap());
		Juggler me = juggle.getJugglemap().get("me");
		me.perform();
	}
	
	public void testPropertyProperty(){
		Juggler juggle= (Juggler)context.getBean("propertyjuggler");
		System.out.println(juggle.getPros());
	}
	
	public void testNullProperty(){
		Juggler juggle= (Juggler)context.getBean("propertyjuggler");
		System.out.println(juggle.getNullVal());
	}
	public static void main(String[] args) {
		
	}
}
