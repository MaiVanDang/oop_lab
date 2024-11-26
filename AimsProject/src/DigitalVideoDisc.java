
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private float cost;
	private int lenght;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
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
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.lenght = lenght;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
	}
}
