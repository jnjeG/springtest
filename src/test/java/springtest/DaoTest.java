package springtest;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjj.ch5.UserDao;
import com.cjj.ch5.Users;

public class DaoTest extends TestCase{

	private ApplicationContext context;

	@Override
	protected void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("com/cjj/ch5/ch5Context.xml");
	}
	
	public void testDao(){
		Users users = new Users();
		users.setUsername("lll");
		users.setPasswd("lll");
		users.setEmail("yyy@124.com");
		users.setGrade(1);
		
		UserDao dao = (UserDao)context.getBean("userDao");
		dao.addUsers(users);
		
	}
	
	public static void main(String[] args) {
		
	}
}
