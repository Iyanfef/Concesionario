package com.iyan.proyectoPrueba.util;

import java.util.Date;

import com.iyan.proyectoPrueba.Coches.Coche;
import com.iyan.proyectoPrueba.Personas.Persona;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona = new Persona("Iyan", new Date(), "Lena");
		Coche coche = new Coche(persona);
		coche.setConsumo(2.4f);
		coche.setPuertas(5);
		System.out.println(coche);
	}

}
