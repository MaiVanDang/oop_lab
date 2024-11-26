package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Aims {
	
	public static void main(String[] args) {
		Cart anOrderCart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		anOrderCart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "George", 87, 24.95f);
		anOrderCart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
				"Animation", 18.99f);
		anOrderCart.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is: ");
		System.out.println(anOrderCart.totalCost());
		
		anOrderCart.removeDigitalVideoDisc(dvd3);
	}
}
