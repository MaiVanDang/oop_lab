
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
		
		//lab3

		// Phương thức thêm list đĩa video vào giỏ hàng 2.1a (method overloading)
		Cart listOrderCart = new Cart();
		DigitalVideoDisc[] listDVD = new DigitalVideoDisc [2];
		listDVD[0] = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		listDVD[1] = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George", 87, 24.95f);
		//listOrderCart.addDigitalVideoDisc (listDVD);

		// Phương thức thêm list đĩa video vào giỏ hàng 2.1b (method overloading)
		listOrderCart.addDigitalVideoDisc (listDVD[0], listDVD [1], listDVD[0], listDVD [1]);

		// Phương thức thêm 2 đĩa video vào giỏ hàng 2.2 (method overloading)
		anOrderCart.addDigitalVideoDisc (dvd1, dvd2);
	}
}
