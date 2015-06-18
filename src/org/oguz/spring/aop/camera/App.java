package org.oguz.spring.aop.camera;

import org.oguz.spring.aop.camera.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/oguz/spring/aop/camera/beans.xml");
		
		
		/*Object obj = context.getBean("camera");
		System.out.println(obj.getClass());
		System.out.println(obj instanceof Camera);*/
		
		ICamera cam = (ICamera)context.getBean("camera");
		Lens lens = (Lens)context.getBean("lens");
		Car car = (Car)context.getBean("car");
		
		
		try
		{
			cam.snap();
		}
		catch (Exception e)
		{
			System.out.println("cought exception: "+e.getMessage());
		}
		cam.snap(1000);		
		cam.snapNight();
		//lens.zoom(15);
		//car.start();
		
		
		
		context.close();
	}
}
