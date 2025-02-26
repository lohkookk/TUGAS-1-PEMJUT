import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner hehe = new Scanner(System.in);
        
        System.out.println();
        System.out.println("=== Program Kalkulator ===");
        System.out.println("Bentuk yang ingin dihitung :");
        System.out.println("1. Lingkaran");
        System.out.println("2. Segi Empat");
        System.out.print("masukan pilihan anda : ");
        int pilihan = hehe.nextInt();

        switch (pilihan) {
            case 1:
            System.out.println();
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = hehe.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jariJari);
                System.out.println("-----------------------------------------");
                System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
                System.out.println("-----------------------------------------");
                break;
            
            case 2:
            System.out.println();
                System.out.print("Masukkan panjang segiempat: ");
                double panjang = hehe.nextDouble();
                System.out.print("Masukkan lebar segiempat: ");
                double lebar = hehe.nextDouble();
                SegiEmpat segiEmpat = new SegiEmpat(panjang, lebar);
                System.out.println();
               System.out.println("====================================================");
                System.out.println("Luas Segiempat: " + segiEmpat.hitungLuas());
                System.out.println();
                System.out.println("Keliling Segiempat: " + segiEmpat.hitungKeliling());
                System.out.println();
                System.out.println("Panjang Diagonal Segiempat: " + segiEmpat.hitungDiagonal());
                System.out.println("====================================================");
                break;
            
            default:
                System.out.println("Dibaca lee pilihannya apa aja");
                break;
        }
        
        hehe.close();
    }
}
