
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private float cost;
<<<<<<< HEAD
<<<<<<<< HEAD:OtherProject/Lab02/src/DigitalVideoDisc.java
	private int lenght;	

========
	private int lenght;
	
>>>>>>>> 086f0e62dc67af42e469e76c5753f537e14b1fea:AimsProject/src/DigitalVideoDisc.java
=======
	private int lenght;
	
>>>>>>> 086f0e62dc67af42e469e76c5753f537e14b1fea
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public float getCost() {
		return cost;
	}
	public int getLenght() {
		return lenght;
	}
<<<<<<< HEAD
<<<<<<<< HEAD:OtherProject/Lab02/src/DigitalVideoDisc.java
	
========
>>>>>>>> 086f0e62dc67af42e469e76c5753f537e14b1fea:AimsProject/src/DigitalVideoDisc.java
=======
>>>>>>> 086f0e62dc67af42e469e76c5753f537e14b1fea
	public DigitalVideoDisc(String title, String category, String director, int lenght, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.lenght = lenght;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
<<<<<<< HEAD
	
	
=======
>>>>>>> 086f0e62dc67af42e469e76c5753f537e14b1fea
}
