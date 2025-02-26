public class SegiEmpat {
    double panjang, lebar;

    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
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