package in.rudresh.movie;

import java.time.LocalDate;
import java.util.*;

public class MovieApp {

	public static void main(String[] args) {

		List<Movie> movies = Arrays.asList(new Movie(1, "KGF", "Action", 9.5, LocalDate.of(2018, 12, 21)),
				new Movie(2, "Inception", "Sci-Fi", 9.0, LocalDate.of(2010, 7, 16)),
				new Movie(3, "Avengers Endgame", "Action", 8.9, LocalDate.of(2019, 4, 26)),
				new Movie(4, "Interstellar", "Sci-Fi", 9.1, LocalDate.of(2014, 11, 7)),
				new Movie(5, "Drishyam", "Thriller", 8.5, LocalDate.of(2015, 7, 31)),
				new Movie(6, "Pushpa", "Action", 7.5, LocalDate.of(2021, 12, 17)),
				new Movie(7, "Kantara", "Drama", 8.3, LocalDate.of(2022, 9, 30)));

		MovieService service = new MovieService(movies);
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n====== MOVIE MENU ======");
			System.out.println("1. View All Movies");
			System.out.println("2. Search by Genre");
			System.out.println("3. Search by Rating");
			System.out.println("4. Top 3 Movies");
			System.out.println("5. Sort by Rating");
			System.out.println("6. Group by Genre");
			System.out.println("7. Movies Released After Year");
			System.out.println("8. Trending Movies");
			System.out.println("9. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				service.showAll();
				break;

			case 2:
				System.out.print("Enter Genre: ");
				service.searchByGenre(sc.nextLine());
				break;

			case 3:
				System.out.print("Enter Minimum Rating: ");
				service.searchByRating(sc.nextDouble());
				break;

			case 4:
				service.topNMovies(3);
				break;

			case 5:
				service.sortByRating();
				break;

			case 6:
				service.groupByGenre();
				break;

			case 7:
				System.out.print("Enter Year: ");
				service.releasedAfter(sc.nextInt());
				break;

			case 8:
				service.trendingMovies();
				break;

			case 9:
				System.out.println("Bye...");
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
