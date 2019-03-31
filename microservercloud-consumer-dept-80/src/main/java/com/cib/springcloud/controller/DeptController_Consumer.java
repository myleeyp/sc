package com.cib.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cib.springcloud.entity.Dept;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {
	
	/**
	 * restTemplate:rest访问的模板 
	 * url:地址
	 * 
	 */
	@Autowired
	private RestTemplate restTemplate;
	// private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://MICROSERVERCLOUD-DEPT";
	
	@RequestMapping(value="/add")
	public boolean add(Dept dept) {
		Boolean b = restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
		return b;
	};
	
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
		return dept;
	};
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Dept> list(){
		List<Dept> list = restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
		return list;
	};
}
