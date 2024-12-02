package hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Store {
	// List DVDs
	private List<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

	public void addDVD(DigitalVideoDisc dvd) {
		int index = itemsInStore.indexOf(dvd);
		if (index != -1) {
			System.out.println(dvd.getTitle() + " is already in the store.");
		} else {
			itemsInStore.add(dvd);
			System.out.println(dvd.getTitle() + " has been added to the store.");
		}
	}

	public void removeDVD(DigitalVideoDisc dvd) {
		boolean removed = itemsInStore.remove(dvd);
		if (removed) {
			System.out.println(dvd.getTitle() + " has been removed from the store.");
		} else {
			System.out.println(dvd.getTitle() + " is not found in the store.");
		}
	}

	public void print() {
		for (int i = 0; i < itemsInStore.size(); i++) {
			System.out.println((i + 1) + ". " + itemsInStore.get(i));
		}
	}
}