package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.disc.*;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("JungLe");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

		//changeTitle(jungleDVD, cinderellaDVD.getTitle());
		//System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
		//lab3
		SubDigitalVideoDisc subjungleDVD = new SubDigitalVideoDisc(jungleDVD);
		SubDigitalVideoDisc subcinderellaDVD = new SubDigitalVideoDisc(cinderellaDVD);
		swap(subjungleDVD, subcinderellaDVD);
		System.out.println("lab3");
		System.out.println("\nAfter swap:");
        System.out.println("Jungle DVD title: " + subjungleDVD.dvd.getTitle());
        System.out.println("Cinderella DVD title: " + subcinderellaDVD.dvd.getTitle());
	}

	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}

	public static void swap(SubDigitalVideoDisc o1, SubDigitalVideoDisc o2) {
        // Hoán đổi đối tượng DVD
        DigitalVideoDisc temp = o1.dvd;
        o1.dvd = o2.dvd;
        o2.dvd = temp;
    }
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
}