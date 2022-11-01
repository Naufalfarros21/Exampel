public class DataType {
    public static void main(String[] args) {
        int panjang;
        int lebar;
        int luas;
        int keliling;

        panjang = 8;
        lebar = 7;
        luas = panjang * lebar;
        keliling = 2 *(panjang+lebar);

        System.out.println("luas persegi panjang adalah " + luas);
        System.out.println("keliling persegi panjang adalah" + keliling);

        char huruf;
        huruf = 'b';
        if (huruf=='b'){
            System.out.println("hurufnya adalah " + huruf);
        }else{
            System.out.println("hurufnya bukan b");
        }
    }
}