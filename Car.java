package collection;

public class Car {
   
  private String carname;
  private int carmodel;
  private String colour;
  private int price;
	

public Car(String carname, int carmodel, String colour, int price) {

	this.carname = carname;
	this.carmodel = carmodel;
	this.colour = colour;
	this.price = price;
}


public String getCarname() {
	return carname;
}


public void setCarname(String carname) {
	this.carname = carname;
}


public int getCarmodel() {
	return carmodel;
}


public void setCarmodel(int carmodel) {
	this.carmodel = carmodel;
}


public String getColour() {
	return colour;
}


public void setColour(String colour) {
	this.colour = colour;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}




@Override
public String toString() {
	return "Car [carname=" + carname + ", carmodel=" + carmodel + ", colour=" + colour + ", price=" + price + "]";
}


}
