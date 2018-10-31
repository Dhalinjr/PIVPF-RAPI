package com.dhalinjr.PIVPFRAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Demo")
public class Demo {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="nombre")
	private long nombre;
	
	
}
