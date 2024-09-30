package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) 
	{
		String resource_file="in/sp/resources/applicationContext";
		ApplicationContext context=new ClassPathXmlApplicationContext(resource_file);	
		
		Student std=(Student) context.getBean("student");
		std.display();
	}

}
