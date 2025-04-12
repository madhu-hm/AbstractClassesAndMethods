package assignment11;

abstract class Movie{
	protected String title;
	protected int year;
	protected double rating;
	
	public Movie(String title,int year,double rating) {
		this.title=title;
		this.year=year;
		this.rating=rating;
	}
	
	public abstract String getGenre();
	
	public abstract void displayInfo();
}

class ActionMovie extends Movie{
	public ActionMovie(String title,int year,double rating) {
		super(title,year,rating);
	}
	
	public String getGenre() {
		return "Action";
	}
	
	public void displayInfo() {
		System.out.println("Title: "+title);
		System.out.println("Year: "+year);
		System.out.println("Rating: "+rating);
		System.out.println("Genre: "+getGenre());
	}
}

class SciFiMovie extends Movie{
	public SciFiMovie(String title,int year,double rating) {
		super(title,year,rating);
	}
	public String getGenre() {
		return "Sci-Fi";
	}
	public void displayInfo() {
		System.out.println("Title: "+title);
		System.out.println("Year: "+year);
		System.out.println("Rating: "+rating);
		System.out.println("Genre: "+getGenre());
	}
}
public class MovieClass {
	public static void main(String[] args) {
		Movie retro=new ActionMovie("Retro",2025,5.0);
		Movie interstellar=new SciFiMovie("Interstellar",2014,4.5);
		retro.displayInfo();
		System.out.println();
		interstellar.displayInfo();
	}
}
