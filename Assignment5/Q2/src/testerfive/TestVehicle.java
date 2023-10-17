package testerfive;

import com.app.vehicle.Vehicle;

/*Q2. Create a class Vehicle , under the package : com.app.vehicles , to represent any vehicle.
state(data members) : chasisNo : int , color : String , price : double
chasisNo must be unique (non duplicate) for any vehicle (primary Key : unique ID)
Get complete state : toString
Create a class TestVehicle under the package "tester" and accept details of 2 vehicles from user .
Display "SAME" or "DIFFERENT" , in case of same or different chasis nos.
Hint : override equals method inherited from Object class : to replace ref equality by content*/
public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		vehicle1.acceptData();
		System.out.println("Vehicle Details - " + vehicle1);
		Vehicle vehicle2 = new Vehicle();
		vehicle2.acceptData();
		System.out.println("Vehicle Details - " + vehicle2);
		if (vehicle1.equals(vehicle2)) {
			System.out.println("SAME");
		} else
			System.out.println("DIFFERENT");
	}

}
