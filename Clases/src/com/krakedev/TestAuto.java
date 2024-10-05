package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1;
		Auto auto2;
		
		auto1=new Auto();
		auto2 = new Auto();
		
		auto1.marca="Chevrolet";
		auto1.anio=2024;
		auto1.precio=23.500f;
		
		auto2.marca="Nissan";
		auto2.anio=2023;
		auto2.precio=23.500f;
		
		System.out.println("****Auto 1****");
		System.out.println("Auto 1: "+auto1.marca);
		System.out.println("Auto 1: "+auto1.anio);
		System.out.println("Auto 1: "+auto1.precio);
		
		System.out.println("---------------");
		System.out.println("****Auto 2****");
		System.out.println("Auto 2: "+auto2.marca);
		System.out.println("Auto 2: "+auto2.anio);
		System.out.println("Auto 2: "+auto2.precio);
		
	}

}
