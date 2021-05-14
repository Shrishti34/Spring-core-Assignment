package Demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In Before Initialization method bean name is " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) 
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In After Initialization method bean name is " + beanName);
		return bean;
	}
	

}
