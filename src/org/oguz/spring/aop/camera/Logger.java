package org.oguz.spring.aop.camera;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger
{
	@Pointcut ("execution(* org.oguz.spring.aop.camera.Camera.*(..))")
	public void cameraSnap(){
		
	}
	
	@Pointcut ("within(org.oguz.spring.aop.camera..*)")
	public void withinDemo(){
		
	}
	
	@Pointcut ("target(org.oguz.spring.aop.camera.Camera)")
	public void targetDemo(){
		
	}
	@Pointcut ("this(org.oguz.spring.aop.camera.ICamera)")
	public void thisDemo(){
		
	}
		
	
	@Pointcut ("execution(* org.oguz.spring.aop.camera.Camera.snap(String))")
	public void cameraSnapName(){
		
	}
	
	@Pointcut ("execution(* *.*(..))")
	public void cameraRelatedAction(){
		
	}
	
	@Before("withinDemo()")
	public void withinDemoAdvice(){
		System.out.println("***Before WITHIN demo advice***");
	}
	

	@Before("targetDemo()")
	public void targetDemoAdvice(){
		System.out.println("***Before TARGET demo advice***");
	}
	
	@Before("thisDemo()")
	public void thisDemoAdvice(){
		System.out.println("***Before THIS demo advice***");
	}
	
	@Before("cameraSnapName()")
	public void aboutToTakePhotoWithName(){
		//System.out.println("About to take photo with Name...");
	}
	
	@After("cameraRelatedAction()")
	public void afterCameraRelatedAction(){
		
		//System.out.println("After advice, something related to camera actions...");
	}
	
	@AfterReturning("cameraRelatedAction()")
	public void afterReturningCameraRelatedAction(){
		
		//System.out.println("After Returning advice, something related to camera actions...\n");
	}
	
	@AfterThrowing("cameraRelatedAction()")
	public void afterThrowingCameraRelatedAction(){
		
		//System.out.println("After Throwing advice, something related to camera actions...\n");
	}
	
	@Around("cameraRelatedAction()")
	public void aroundAdvice(ProceedingJoinPoint p){
		
		//System.out.println("\nAround advice...");
		
		try
		{
			p.proceed();
		}
		catch (Throwable e)
		{
			// TODO Auto-generated catch block
			System.out.println("in around advice: "+e.getMessage());
		}
	}

}
