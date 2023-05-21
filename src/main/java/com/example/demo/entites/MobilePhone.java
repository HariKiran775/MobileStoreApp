package com.example.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MobilePhone {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mobileId;
	private String brandName;
	private String modelName;
	private String color;
	private String batteryPower;
	private String processor;
	private double mobilePhoneCost;
}
