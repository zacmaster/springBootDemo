package com.example.demo.bote;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bote")
public class Bote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bid;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private String color;
	
	
	public Bote() {}
	
	public Bote(int bid, String nombre, String color) {
		super();
		this.bid = bid;
		this.nombre = nombre;
		this.color = color;
	}
	
	public Bote(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	
	public long getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bote [bid=" + bid + ", nombre=" + nombre + ", color=" + color + "]";
	}
	
	
	
	
}
