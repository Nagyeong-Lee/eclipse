
public class Movie {

	private String title;
	private String genre;
	private double review;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getReview() {
		return review;
	}
	public void setReview(double review) {
		this.review = review;
	}
	
	public Movie() {}
	public Movie(String title, String genre, double review) {
		super();
		this.title = title;
		this.genre = genre;
		this.review = review;
	}
	
}
