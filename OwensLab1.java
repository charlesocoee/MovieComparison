//Charles Owens
//CSCI 2010/2011
//W1

package csci2011.owenslab1;

import java.util.Scanner;

/**
 * @author Charles Owens
 * Main method for the Movie class.  It manually creates a defined movie,
 * and then allows the user to input their own data. All done using instances
 * of the Movie class.
 */

public class OwensLab1 {

    //main method for the project
    public static void main(String[] args) {
        //Movie1 manual initialization 
        Movie movie1 = new Movie(); 
        movie1.initialize("Amelie", "Jean-Pierre Jeunet", 2001);
        System.out.println("Your first movie selection is:");
        movie1.display();
        
        //Movie2 intitialization from user input
        Movie movie2 = new Movie();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the name of the movie?");
        String newTitle = keyboard.nextLine();
        movie2.setTitle(newTitle);
        System.out.println("Who is the director of the movie?");
        String newDirector = keyboard.nextLine();
        movie2.setDirector(newDirector);
        System.out.println("What year was the movie made?");
        int newYear = keyboard.nextInt();
        movie2.setYear(newYear);
        System.out.println("Your second movie selection is:");
        movie2.display();
        
        //Test if Movie1 & Movie2 are equal
        if(movie2.equals(movie1))
	  System.out.println("These 2 movies are the same movie"); 
        else
	  System.out.println("These 2 movies are NOT the same movie");
    }
}
