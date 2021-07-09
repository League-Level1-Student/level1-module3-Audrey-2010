package _05_netflix;

public class Netflix {
public static void main(String[] args) {
	Movie movie = new Movie("movie", 3);
	Movie movie2 = new Movie("that other movie", 4);
	Movie movie3= new Movie("pop", 6);
	Movie movie4=new Movie("corn",5);
	Movie movie5= new Movie("dog",4157);
	
	movie5.getTicketPrice();
	
	NetflixQueue queue = new NetflixQueue();
	
	queue.addMovie(movie5);
	queue.addMovie(movie4);
	queue.addMovie(movie3);
	queue.addMovie(movie2);
	queue.addMovie(movie);
	
	queue.sortMoviesByRating();
	queue.printMovies();
	queue.getBestMovie();
	
}
}
