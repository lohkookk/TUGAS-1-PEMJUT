import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner hehe = new Scanner(System.in);
        System.out.println();
        System.out.println("=== Program Kalkulator ===");
        System.out.println("Bentuk yang ingin dihitung :");      
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Persegi");
        System.out.print("masukan pilihan anda : ");
        int pilihan = hehe.nextInt();
        
        switch (pilihan) {
            case 1:
            System.out.println();
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = hehe.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jariJari);
                System.out.println();
                 System.out.println("====================================================");
                System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
                System.out.println();
                System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
                 System.out.println("====================================================");
                break;
            case 2:
            System.out.println();
                System.out.print("Masukkan panjang sisi : ");
                double panjang = hehe.nextDouble();
                System.out.print("Masukkan lebar sisi : ");
                double lebar = hehe.nextDouble();
                segiEmpat PersegiPanjang = new segiEmpat(panjang, lebar);
                System.out.println();
               System.out.println("====================================================");
                System.out.println("Luas Persegi Panjang: " + PersegiPanjang.hitungLuas());
                System.out.println();
                System.out.println("Keliling Persegi Panjang: " + PersegiPanjang.hitungKeliling());
                System.out.println();
                System.out.println("Diagonal Persegi Panjang: " + PersegiPanjang.hitungDiagonal());
                System.out.println("====================================================");
                break;
            case 3:
            System.out.println();
                System.out.print("Masukkan panjang sisi : ");
                double sisi = hehe.nextDouble();
                segiEmpat segiEmpat = new segiEmpat(sisi);
                System.out.println();
               System.out.println("====================================================");
                System.out.println("Luas Persegi: " + segiEmpat.hitungLuas());
                System.out.println();
                System.out.println("Keliling Persegi: " + segiEmpat.hitungKeliling());
                System.out.println();
                System.out.println("Panjang Diagonal Persegi: " + segiEmpat.hitungDiagonal());
                System.out.println("====================================================");
                break;
            default:
                System.out.println("Dibaca lee pilihannya apa aja");
                break;
        }
        hehe.close();
    }
}