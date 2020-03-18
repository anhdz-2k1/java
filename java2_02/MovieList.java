package java2;
import  java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    List<String> movies =  new ArrayList<>();

    public List<String> addList(String name){
        movies.add(name);
        return movies;
    }

    public void printList(){
        System.out.println(movies);
    }

    public List<String> deleteMovie(String name){
        boolean isRemove = movies.remove(name);
        if (isRemove == true) {
            System.out.println("Xóa dữ liệu thành công\n");
    }
        else {
            System.out.println("Phim bạn yêu cầu không có trong danh sách\n");
        }
        return movies;
    }

    public void findMovie(String name){
        System.out.println("Danh sách có chưa phim:" + name +" ? :"+movies.contains(name));
        if (movies.contains(name) == true) {
            System.out.println("index of " + name + ": " + movies.indexOf(name));
        }
        else {
            System.out.println("Không có phim trong danh sách\n");
        }
    }

    public List<String> updateMovie(String beforeName, String afterName){
        int i = movies.indexOf(beforeName);
        boolean isRemove = movies.remove(beforeName);
        if (isRemove == true) {
            movies.add(i, afterName);
        }
        else {
            System.out.println("Không có phim trong danh sách\n");
        }
        return movies;
    }
    public static void main(String[] args) {
        int n;
        String movie;
        MovieList m1 = new MovieList();
        Scanner in = new Scanner(System.in);
        do {
            do {
                System.out.print("Enter 1: Thêm phim\n" +
                        "Enter 2: In ra danh sách phim\n" +
                        "Enter 3: Cập nhật\n" +
                        "Enter 4: Xóa phim\n" +
                        "Enter 5: Tìm kiếm\n" +
                        "Enter 0: Kết thúc\n" +
                        "Enter: ");
                n = in.nextInt();
            } while (n < 0 || n > 5);
            switch (n) {
                case 1:
                    System.out.print("Mời bạn nhập phim cần thêm: ");
                    movie = in.next();
                    m1.addList(movie);
                    break;
                case 2:
                    m1.printList();
                    break;
                case 3:
                    String afMovie;
                    System.out.print("Mời bạn nhập phim cần cập nhật: ");
                    movie = in.next();
                    System.out.print("Nhập phim cập nhật: ");
                    afMovie = in.next();
                    m1.updateMovie(movie,afMovie);
                    break;
                case 4:
                    System.out.print("Mời bạn nhập phim cần xóa: ");
                    movie = in.next();
                    m1.deleteMovie(movie);
                    break;
                case 5:
                    System.out.print("Mời bạn nhập phim cần tìm kiếm: ");
                    movie = in.next();
                    m1.findMovie(movie);
                    break;
            }
        }while (n != 0);
    }

}
