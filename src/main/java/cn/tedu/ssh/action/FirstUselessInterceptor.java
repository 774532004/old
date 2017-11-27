package cn.tedu.ssh.action;

import org.apache.tomcat.jni.Thread;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class FirstUselessInterceptor extends AbstractInterceptor{
	
	private static final long serialVersionUID = 1L;
    @Override
	public void destroy() {
		System.out.println("FirstUselessInterceptor.destroy()");
	}
    @Override
	public void init() {
		System.out.println("FirstUselessInterceptor.init()");
	}
    @Override
	public String intercept(ActionInvocation arg0) throws Exception {
    	System.out.println("FirstUselessInterceptor.intercept().start");
    	String result = arg0.invoke();
    	System.out.println("FirstUselessInterceptor.intercept().end,return:");
		return result;
		
	}
    

}
