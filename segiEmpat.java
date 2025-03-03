
public class segiEmpat {
    double panjang, lebar;

    public segiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public segiEmpat(double sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
    }
    
    double hitungLuas() {
        return panjang * lebar;
    }

    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    double hitungDiagonal() {
        return Math.sqrt((panjang * panjang) + (lebar * lebar));
    }
}