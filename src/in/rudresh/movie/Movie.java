package in.rudresh.movie;

import java.time.LocalDate;

public class Movie {

	private int id;
	private String title;
	private String genre;
	private double rating;
	private LocalDate releaseDate;

	public Movie(int id, String title, String genre, double rating, LocalDate releaseDate) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.releaseDate = releaseDate;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public double getRating() {
		return rating;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	@Override
	public String toString() {
		return id + " | " + title + " | Genre: " + genre + " | Rating: " + rating + " | Released: " + releaseDate;
	}
}
