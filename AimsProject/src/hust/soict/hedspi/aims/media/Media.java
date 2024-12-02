package hust.soict.hedspi.aims.media;

public class Media {
	
	private static int numMedia = 0;
	private int id;
	private String title;
	private String category;
	private float cost;

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

	public float getCost() {
		return cost;
	}

	public Media(String title) {
		this.id = numMedia++;
		this.title = title;
	}
	
	public Media(String title, String category) {
		this.id = numMedia++;
        this.title = title;
        this.category = category;
    }
    
    public Media(String title, String category, float cost) {
    	this.id = numMedia++;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }
}
