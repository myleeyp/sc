package com.cib.springcloud.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cib.springcloud.entity.Dept;
import com.cib.springcloud.service.DeptClientService;

import feign.hystrix.FallbackFactory;
@Component
public class DeptClientServiceFallback implements FallbackFactory<DeptClientService>{
	@Override
	public DeptClientService create(Throwable arg0) {
		return new DeptClientService() {
			@Override
			public boolean add(Dept dept) {
				return false;
			}
			@Override
			public Dept get(Long id) {
				return null;
			}
			@Override
			public List<Dept> list() {
				return null;
			}
		};
	}
}
