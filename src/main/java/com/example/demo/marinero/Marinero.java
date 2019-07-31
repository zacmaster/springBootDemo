package com.example.demo.marinero;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "marine")
public class Marinero {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mid;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private int puntaje;

	Marinero(){
		
	}
	
	public long getMid() {
		return mid;
	}

	public void setMid(long mid) {
		this.mid = mid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	
	
}
