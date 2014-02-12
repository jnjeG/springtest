package com.thingnet.model.aspect.introduce.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import com.thingnet.model.aspect.introduce.ExtendInterface;

@Aspect
public class ExtendIntroducer {
	@DeclareParents(value="com.thingnet.model.aspect.introduce.OriginInterface+",
			defaultImpl=com.thingnet.model.aspect.introduce.ExtendInterfaceImpl.class)
	public static ExtendInterface extiterface;
}
