package com.cib.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cib.springcloud.entity.Dept;
import com.cib.springcloud.service.impl.DeptClientServiceFallback;

@FeignClient(value="MICROSERVERCLOUD-DEPT",fallbackFactory=DeptClientServiceFallback.class)
public interface DeptClientService {
	@RequestMapping(value="/dept/add")
	public boolean add(Dept dept);
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(Long id);
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list();
}
