package com.cib.springcloud.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cib.springcloud.entity.Dept;
import com.cib.springcloud.service.DeptService;

@RestController
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptService.add(dept);
	};
	
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return deptService.get(id);
	};
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Dept> list(){
		return deptService.list();
	};
	
	@RequestMapping(value="/discovery",method=RequestMethod.GET)
	public Object discovery(){
		return this.discoveryClient;
	};
}
