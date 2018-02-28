package com.lishun.aop;

import com.lishun.result.ResultBean;
import com.lishun.result.ResultCode;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author lishun
 * @Description: 控制器aop拦截
 * @date 2017/10/27
 */
@Component
@Aspect
public class ControllerAspect {
	@Pointcut("execution(public com.lishun.result.ResultBean com.lishun.controller.*.*(..))")
	public void dataSource(){};

	@Around("dataSource()")
	public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		ResultBean result = null;
		try {
			result = (ResultBean<?>)proceedingJoinPoint.proceed();
		} catch (Exception e) {
			result = new ResultBean();
			result.setCode(ResultCode.FAILED);
			result.setMessage(e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
}
