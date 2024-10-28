
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private float cost;
	private int lenght;
	
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
}
