import java.util.Scanner;

public class TugasTm {
    public static void main(String[] args) {
        Scanner gopal = new Scanner(System.in);
        String [] NamaSiswa = new String[6];
        for (int n=0; n<NamaSiswa.length; n++){
            System.out.println("Nama Siswa Ke-"+ (n+1)+":");
            NamaSiswa[n]= gopal.next();
        }
        System.out.println("Daftar Nama Siswa: ");
        for (int n=0; n<NamaSiswa.length; n++){
            System.out.println(NamaSiswa[n]);
            if ((n%'a'==0)&&(n%'i'==0)){
                System.out.println("Ada Huruf a/i"+ (n+1)+"");
            }else {
                System.out.println("Tidak Ada Huruf a/i"+ (n++)+"");

            }
        }

        }
    }
