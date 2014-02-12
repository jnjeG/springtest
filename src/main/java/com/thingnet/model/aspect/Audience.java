package com.thingnet.model.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Audience {

	/**
	 * 在表演前
	 */
	public void takeSeat(){
		System.out.println("坐下...");
	}
	/**
	 * 在表演前
	 */
	public void turnOffCellphone(){
		System.out.println("关闭电话...");
	}
	/**
	 * 在表演后
	 */
	public void applaud(){
		System.out.println("鼓掌...");
	}
	/**
	 * 在表演后
	 */
	public void takeBackMoney(){
		System.out.println("表演失败,还钱给我们...");
	}
	
	
	public void kanXingNeng(ProceedingJoinPoint joinpoint){
		try {
			long start = System.nanoTime();
			joinpoint.proceed();
			long end = System.nanoTime();
			System.out.println("cost "+ (end-start)+" nano");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
