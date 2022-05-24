package com.capgemini.sweetcherry.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="cupcake")
public class CupCake {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private int price;
 private String cupcake;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getCupcake() {
	return cupcake;
}
public void setCupcake(String cupcake) {
	this.cupcake = cupcake;
}
@Override
public String toString() {
	return "CupCake [id=" + id + ", price=" + price + ", cupcake=" + cupcake + "]";
}

	

}