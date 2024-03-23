//Charles Owens
//CSCI 2010/2011
//W1
package csci2011.owenslab1;

import java.util.Scanner;

/**
 * @author Charles Owens
 * Class for instantiating new Movie objects, allows a manual creation of 1 object
 * and user can input their own movie info as well. Finally, class will do a comparison
 * of movies to determine sameness or not.
 */
public class Movie {
    //private variables
    private String title;
    private String director;
    private int year;
    
    //set the variables to a new value through manual input on main method class
    public void initialize(String newTitle, String newDirector, int newYear) {       
        if(newTitle != " ")
            title = newTitle;
        else
            System.out.println("ERROR: title field is empty and cannot be processed");
        
        
        if(newDirector != " ")
            director = newDirector;
        else
            System.out.println("ERROR: director field is empty and cannot be processed");

        
        if(newYear <= 1888) {
            System.out.println("ERROR: No movie was made before 1888, please enter a valid year");
            System.exit(0);
        } else {
            year = newYear;
        }
    }
    
    //displays the output to the user
    public void display(){
        System.out.println(title + " dir. " + director + " (" + year + ")");
    }
    
    //public getter to retrieve the private variable title
    public String getTitle() {
        return title;
    }
    
    //public setter to set the private variable title
    public void setTitle(String newTitle) {
        if(newTitle != " ")
            title = newTitle;
        else
            System.out.println("ERROR: title field is empty and cannot be processed");
    }

    //public getter to retrieve the private variable director
    public String getDirector() {
        return director;
    }
    
    //public setter to set the private variable director
    public void setDirector(String newDirector){
        if(newDirector != " "){
            director = newDirector;
        } else {
            System.out.println("ERROR: director field is empty and cannot be processed");
        }
    }
    
    //public getter to retrieve the private variable year
    public int getYear() {
        return year;
    }
    
    //public setter to set the private variable year
    public void setYear(int newYear) {
        if(newYear <= 1888) {
            System.out.println("ERROR: No movie made before 1888, please enter a valid year");
            System.exit(0);
        } else {
            year = newYear;
        }
    }
    
    //method to evaluate if the movies are the same
    public boolean equals(Movie compareMovie){
        return(this.title.equalsIgnoreCase(compareMovie.title)) && 
                (this.director.equalsIgnoreCase(compareMovie.director)) &&
                    (this.year == compareMovie.year);
    }
}
