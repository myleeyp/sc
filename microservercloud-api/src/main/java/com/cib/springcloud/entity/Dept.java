package com.cib.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain=true)
@Setter
@Getter
public class Dept implements Serializable{
	private static final long serialVersionUID = 19414956386197274L;
	private Long deptno;
	private String dname;
	private String db_source;
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
}
