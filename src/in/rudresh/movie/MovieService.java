package in.rudresh.movie;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService {

	private List<Movie> movies;

	public MovieService(List<Movie> movies) {
		this.movies = movies;
	}

	public void showAll() {
		movies.forEach(System.out::println);
	}

	public void searchByGenre(String genre) {
		movies.stream().filter(m -> m.getGenre().equalsIgnoreCase(genre)).forEach(System.out::println);
	}

	public void searchByRating(double minRating) {
		movies.stream().filter(m -> m.getRating() >= minRating)
				.sorted(Comparator.comparing(Movie::getRating).reversed()).forEach(System.out::println);
	}

	public void topNMovies(int n) {
		movies.stream().sorted(Comparator.comparing(Movie::getRating).reversed()).limit(n).forEach(System.out::println);
	}

	public void sortByRating() {
		movies.stream().sorted(Comparator.comparing(Movie::getRating).reversed()).forEach(System.out::println);
	}

	public void groupByGenre() {
		Map<String, List<Movie>> groups = movies.stream().collect(Collectors.groupingBy(Movie::getGenre));

		System.out.println(groups);
	}

	public void releasedAfter(int year) {
		movies.stream().filter(m -> m.getReleaseDate().getYear() >= year).forEach(System.out::println);
	}

	public void trendingMovies() {
		movies.parallelStream().sorted(Comparator.comparing(Movie::getRating).reversed()).limit(3)
				.forEach(System.out::println);
	}
}
