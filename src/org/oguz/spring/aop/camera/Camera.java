package org.oguz.spring.aop.camera;

import org.springframework.stereotype.Component;

@Component
public class Camera implements PhotoSnapper, ICamera
{

	public Camera()
	{
		System.out.println("Hello from cam constructor");
	}
	/* (non-Javadoc)
	 * @see org.oguz.spring.aop.camera.ICamera#snap()
	 */
	@Override
	public void snap() throws Exception
	{
		System.out.println("snap");
		
		//throw new Exception("Bye Bye");
	}
	
	/* (non-Javadoc)
	 * @see org.oguz.spring.aop.camera.ICamera#snap(int)
	 */
	@Override
	public void snap(int exposure)
	{
		System.out.println("snap! exposure: " +exposure);
	}
	
	/* (non-Javadoc)
	 * @see org.oguz.spring.aop.camera.ICamera#snap(java.lang.String)
	 */
	@Override
	public String snap(String name)
	{
		System.out.println("snap! name: " +name);
		
		return name;
	}
	
	/* (non-Javadoc)
	 * @see org.oguz.spring.aop.camera.ICamera#snapNight()
	 */
	@Override
	public void snapNight()
	{
		System.out.println("snap night mode");
	}
	
	
}
