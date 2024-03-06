public class SegitigaSamaKaki extends Segitiga {
    public SegitigaSamaKaki(double alas, double tinggi, String nama) {
        super(alas, tinggi, tinggi, tinggi, tinggi, nama);
    }

    public void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling() {
        keliling = 3 * Math.sqrt(2) * alas;
    }
}