public class LatihanMethod {
    public static void Penjumlahan(){
        int angka1=3;
        int angka2=4;
        int hasil = angka1+angka2;
    }
    public static void Perkalian(){
        int angka3=5;
        int angka4=8;
        int hasil_kali = angka3*angka4;
    }

    public static void CetakHeader(String header){
        System.out.println(header);

    }
    public static void CetakFoother(String footer){
        System.out.println(footer);
        System.out.println("----------------------------------");
    }
    public static void GanjilGenap(int number1, int number2){
        int AfterCalculate = number1*number2;
        if (AfterCalculate%2==0){
            System.out.println(AfterCalculate+" Adalah Genap");
        }else {
            System.out.println(AfterCalculate+" Adalah Ganjil");
        }
    }

    public static void main(String[] args) {
        Penjumlahan();
        Perkalian();
        CetakHeader("Ini adalah Header untuk Ganjil Genap");
        GanjilGenap(5,11);
        CetakFoother("ini Hasil dari Ganjil Genap");
    }
}