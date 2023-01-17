import java.util.ArrayList;
import java.util.Scanner;

public class CGV {
    private String IDMovie;
    private int JumTicket;
    private String MovieName;
    private int MoviePrice;
    private String UserName;

    public String getIDMovie() {
        return IDMovie;
    }

    public void setIDMovie(String IDMovie) {
        this.IDMovie = IDMovie;
    }

    public int getJumTicket() {
        return JumTicket;
    }

    public void setJumTicket(int jumTicket) {
        JumTicket = jumTicket;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public int getMoviePrice() {
        return MoviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        MoviePrice = moviePrice;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public CGV(){

    }
    private void TotalJumlahPenonton(ArrayList<CGV>nontonApa, String avatar){

    }
    public CGV(String setIdMovie, int setJumticket, String setMoviename, int setMoviePrice, String setUsername){
        this.IDMovie = setIdMovie;
        this.JumTicket = setJumticket;
        this.MovieName = setMoviename;
        this.MoviePrice = setMoviePrice;
        this.UserName = setUsername;
    }



    public void main(String[] args) {
        int jumUser = 20;
        Scanner sc = new Scanner(System.in);
        ArrayList<CGV> nontonApa = new ArrayList<>();
        System.out.println("Film yang akan ditonton : ");
        String movieSelect = sc.nextLine();
        ArrayList<String> myUser1 = new ArrayList<>();
        CGV pesanan = new CGV();
        for(int index=0; index<jumUser;index++){
            System.out.println("Nama User : ");
            String myUser = sc.nextLine();
            myUser1.add(myUser);
            pesanan.setIDMovie("1");
            pesanan.setJumTicket(jumUser);
            pesanan.setMovieName(movieSelect);
            pesanan.setMoviePrice(55000);
            pesanan.setUserName("myUser1");
            nontonApa.add(pesanan);
        }
        // Menampilkan Jumlah penonton movie tertentu
        pesanan.TotalJumlahPenonton(nontonApa,"Avatar");
    }
}
