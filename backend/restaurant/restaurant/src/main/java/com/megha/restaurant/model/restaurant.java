package com.megha.restaurant.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="restaurantdetails")
public class restaurant {
	restaurant(){}
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="orderno")
	private int orderno;
	@Column(name="Name")
	private String Name;
	@Column(name="time")
	private int time;
	@Column(name="address")
	private String address;
	@Column(name="mobileno")
	private int mobileno;
	@Column(name="dishes")
	private String dishes;	
	
	public int getOrderno() {
		return orderno;
	}
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getDishes() {
		return dishes;
	}

	public void setDishes(String dishes) {
		this.dishes = dishes;
	}


	public restaurant(int time,String Name,int orderno,String address,int mobileno,String dishes) {
		super();
		this.orderno=orderno;
		this.Name=Name;
		this.time=time;
		this.address=address;
		this.mobileno=mobileno;
		this.dishes=dishes;
	}
}