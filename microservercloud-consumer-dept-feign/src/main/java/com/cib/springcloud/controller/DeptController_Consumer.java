package com.cib.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cib.springcloud.entity.Dept;
import com.cib.springcloud.service.DeptClientService;

@RestController
@RequestMapping("/consumer/feign/dept")
public class DeptController_Consumer {
	@Autowired
	private DeptClientService service;
	
	@RequestMapping(value="/add")
	public boolean add(Dept dept) {
		return service.add(dept);
	};
	
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	};
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Dept> list(){
		return service.list();
	};
}
