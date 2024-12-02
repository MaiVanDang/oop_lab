package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class Media implements Comparable<Media>{
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
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
    
    @Override
    public boolean equals(Object obj) {
    	if (this == obj) {
            return true;
        }
    	
        if (!(obj instanceof Media)) {
            return false;
        }
        
        Media other = (Media) obj;

        return this.title != null ? this.title.equals(other.title) : other.title == null;
    }
    
    @Override
    public String toString() {
    	return "Media: " + this.getTitle() + 
    			" - Category: " + this.getCategory() + 
    			" - Cost: " + this.getCost() + "$";
    }
    
    @Override
    public int compareTo(Media other) {
        int titleComparison = this.getTitle().compareTo(other.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        } else {
            return Double.compare(this.getCost(), other.getCost());
        }
    }
}
