public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0; 

    // Phương thức thêm đĩa video vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full!");
            }
        } else {
            System.out.println("The cart is full! Cannot add more items.");
        }
    }
    
    // Phương thức thêm list đĩa video vào giỏ hàng 2.1a (method overloading)
//    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//    	for(DigitalVideoDisc dvd : dvdList) {
//    		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
//    			itemsOrdered[qtyOrdered] = dvd;
//                qtyOrdered++;
//                System.out.println("The disc \"" + dvd.getTitle() + "\" has been added.");
//                if (qtyOrdered == MAX_NUMBERS_ORDERED) {
//                    System.out.println("The cart is almost full!");
//                    return;
//                }
//    		} else {
//    			System.out.println("The cart is full! Cannot add more items.");
//    			return;
//    		}
//    	}
//    }
    
    // Phương thức thêm list đĩa video vào giỏ hàng 2.1b (method overloading)
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
    	for(DigitalVideoDisc dvd : dvdList) {
    		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
    			itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("The disc \"" + dvd.getTitle() + "\" has been added.");
                if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                    System.out.println("The cart is almost full!");
                    return;
                }
    		} else {
    			System.out.println("The cart is full! Cannot add more items.");
    			return;
    		}
    	}
    }  
    
    // Phương thức thêm 2 đĩa video vào giỏ hàng 2.2 (method overloading)
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        if(qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
        	itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The disc \"" + dvd1.getTitle() + "\" has been added.");
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The disc \"" + dvd2.getTitle() + "\" has been added.");
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full!");
            }
        }else if (qtyOrdered + 1 == MAX_NUMBERS_ORDERED) {
        	itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The disc \"" + dvd1.getTitle() + "\" has been added.");
            System.out.println("The cart is almost full!");
        }else {
        	System.out.println("The cart is full! Cannot add more items.");
        }
    }
    
    // Phương thức xóa đĩa video khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                itemsOrdered[i] = itemsOrdered[qtyOrdered - 1]; // Thay thế với đĩa cuối cùng
                itemsOrdered[qtyOrdered - 1] = null; // Xóa đĩa cuối cùng
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the cart.");
    }

    // Phương thức tính tổng chi phí của giỏ hàng
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Phương thức in danh sách đĩa video trong giỏ hàng
//    public void printCart() {
//        System.out.println("Items in the cart:");
//        for (int i = 0; i < qtyOrdered; i++) {
//            System.out.println("- " + itemsOrdered[i].getTitle() + " (Cost: " + itemsOrdered[i].getCost() + ")");
//        }
//        System.out.println("Total Cost: " + totalCost());
//    }
    
    public void print()
    {
    	System.out.println("**************************CART***********************");
    	System.out.println("Ordered Items:");
    	for (int i = 0; i < qtyOrdered; i++)
    	{
    		System.out.println(itemsOrdered[i]);
    	}
    	System.out.println("Total cost: " + totalCost());
    	System.out.println("*****************************************************");
    }
    
    public void searchByID(int id)
    {
    	boolean found = false;
    	for (int i = 0; i < qtyOrdered; i++)
    	{
    		if (itemsOrdered[i].getId() == id)
    		{
    			System.out.println("Found" + itemsOrdered[i]);
    			found = true;
    		}
    	}
    	if (found==false)
    	{
    		System.out.println("Sorry, no DVDs were found that match the ID provided!");
    	}
    }
    
    public void searchByTitle(String keyword)
    {
    	boolean matchFound = false;
    	for (int i=0; i < qtyOrdered; i++)
    	{
    		if (itemsOrdered[i].isMatch(keyword))
    		{
    			System.out.println("Found" + itemsOrdered[i]);
    			matchFound = true;
    		}
    	}
    	if (matchFound == false)
    	{
    		System.out.println("Sorry, no DVDs were found with \"" + keyword +"\" in the title!");
    	}
    }
    
 
}