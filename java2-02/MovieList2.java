package java2;
import  java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MovieList2 {
    private ArrayList<String> movieList = new ArrayList<>();

    public void addMovie(String movie){
        movieList.add(movie);
        System.out.println("added to the movie " + movie);

    }
    public void displayList(){
        System.out.println("You have " + movieList.size() + " item in favorite List");
        for(int i = 0; i < movieList.size(); i ++){
            System.out.println("Movie " + (i+1) + " " + movieList.get(i));
        }
    }
    public void updateMovie(int index, String movie){
        movieList.set(index, movie);
        System.out.println("Updated");
        System.out.println("Movie " + (index + 1) + " " + movie);
    }

    public void removeMovie(int index) {
        String movie = movieList.get(index);
        movieList.remove(index);
        System.out.println("Removed " + movie);
    }
    public String findMovie(String seach){
        int position = movieList.indexOf(seach);
        if(position > 0 ){
            return movieList.get(position);
        } else {
            return null;
        }

    }

    public static void main(String[] args){

        int n,index;
        String movie;

        MovieList2 m1 = new MovieList2();
        Scanner in = new Scanner(System.in);

        do {
            do {
                System.out.print("Enter 1: Add Movie\n" +
                        "Enter 2: Printf Movie\n" +
                        "Enter 3: Update\n" +
                        "Enter 4: Remove Movie\n" +
                        "Enter 5: Find Movie\n" +
                        "Enter 0: End\n" +
                        "Enter: ");
                n = in.nextInt();
            } while (n < 0 || n > 5);
            switch (n) {
                case 1:
                    System.out.print("Emter film : ");
                    movie = in.next();
                    m1.addMovie(movie);
                    break;
                case 2:
                    m1.displayList();
                    break;
                case 3:
                    System.out.println("Enter index film");
                    index=in.nextInt();
                    System.out.println("enter Movie");
                    movie=in.next();
                    m1.updateMovie(index,movie);
                case 4:
                    System.out.println("Enter index film");
                    index = in.nextInt();
                    m1.removeMovie(index);
                    break;
                case 5:
                    System.out.println("Enter Movie: ");
                    movie = in.next();
                    m1.findMovie(movie);
                    break;
            }
        }while (n != 0);
    }

}

