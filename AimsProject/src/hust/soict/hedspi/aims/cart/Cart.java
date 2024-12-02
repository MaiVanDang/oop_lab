package hust.soict.hedspi.aims.cart;

import java.util.*;

import hust.soict.hedspi.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    public int qtyOrdered = 0; 
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    
    public void addMedia(Media media) {
    	if(itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
    		System.out.println("The cart is almost full!");
    	}else {
    		itemsOrdered.add(media);
    		System.out.println(media.getTitle() + "has been added!");
    	}
    }
    
    public void removeMedia(Media media) {
    	if(itemsOrdered.remove(media)) {
    		System.out.println(media.getTitle() + "has been remove from the cart.");
    	}else {
    		System.out.println("Media not found in cart!");
    	}
    }
    
    public float totalCost() {
        float totalCost = 0;
        for (Media media : itemsOrdered) {
            totalCost += media.getCost();
        }
        return totalCost;
    }

    
    public void print()
    {
    	System.out.println("**************************CART***********************");
    	System.out.println("Ordered Items:");
    	int i = 0;
    	for (Media media : itemsOrdered)
    	{
    		i += 1;
    		System.out.println(i + "." + media);
    	}
    	System.out.println("Total cost: " + totalCost());
    	System.out.println("*****************************************************");
    }
    
    public void searchByID(int id)
    {
    	boolean found = false;
    	for (Media media : itemsOrdered)
    	{
    		if (media.getId() == id)
    		{
    			System.out.println("Found" + media);
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
    	for (Media media : itemsOrdered)
    	{
    		if (media.isMatch(keyword))
    		{
    			System.out.println("Found" + media);
    			matchFound = true;
    		}
    	}
    	if (matchFound == false)
    	{
    		System.out.println("Sorry, no DVDs were found with \"" + keyword +"\" in the title!");
    	}
    }
    
    public void empty() {
        if (itemsOrdered.size() == 0) {
            System.out.println("Nothing to remove!");
        } else {
            qtyOrdered = 0;
            itemsOrdered.clear();
            System.out.println("Order created.");
            System.out.println("Now your current cart will be empty!");
            System.out.println();
        }
    }
    
 // Search to remove
    public Media searchToRemove(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}
    
 // Sort media in cart
    public void sortMediaByTitle() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
    public void sortMediaByCost() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
}