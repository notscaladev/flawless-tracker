package com.flawless.core.config;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.Resource;

public class EntityConfiguration implements ApplicationContextAware{
	
	private ApplicationContext mWebApplicationContext;
	private final HashMap<String, Class<?>> entityMap = new HashMap<String, Class<?>>(50);
	private ApplicationContext mApplicationContext;
	private Resource[] mEntityContexts;
	private Set<String> mergedEntityContexts;
	
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.mWebApplicationContext = context;
	}
	
	public void configureMergedItems(){
		final Set<Resource> temp = new LinkedHashSet<Resource>();
		if (mergedEntityContexts != null && !mergedEntityContexts.isEmpty()){
			for (String location : mergedEntityContexts){
				temp.add(mWebApplicationContext.getResource(location));
			}
		}
		
		if (mEntityContexts != null){
			for (Resource resource : mEntityContexts){
				temp.add(resource);
			}
		}
		
		mEntityContexts = temp.toArray(new Resource[temp.size()]);
		mApplicationContext = new GenericXmlApplicationContext(mEntityContexts);
	}
	
	public Class<?> lookupEntityClass(String beanId){
		Class<?> clazz;
		if (entityMap.containsKey(beanId)){
			clazz = entityMap.get(beanId);
		} else {
			Object object = mApplicationContext.getBean(beanId);
			clazz = object.getClass();
			entityMap.put(beanId, clazz);
		}
		return clazz;
	}
	
	public String[] getEntityBeanNames(){
		return mApplicationContext.getBeanDefinitionNames();
	}
	
	@SuppressWarnings("unchecked")
	public <T> Class<T> lookupEntityClass(String beanId, Class<T> resultClass){
		Class<T> clazz;
		if (entityMap.containsKey(beanId)){
			clazz = (Class<T>) entityMap.get(beanId);
		} else {
			Object object = mApplicationContext.getBean(beanId);
			clazz = (Class<T>) object.getClass();
			entityMap.put(beanId, clazz);
		}
		return clazz;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T createEntityInstance(String beanId, Class<T> resultClass){
		T bean = (T) mApplicationContext.getBean(beanId);
		return bean;
	}
	
	public Resource[] getEntityContexts(){
		return mEntityContexts;
	}
	
	public void setEntityContexts(Resource[] entityContexts){
		this.mEntityContexts = entityContexts;
	}
}
