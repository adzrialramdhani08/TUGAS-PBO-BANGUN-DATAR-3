public class BangunDatar {
    protected double luas;
    protected double keliling;
    protected static String nama;

    public double getLuas() {
        return this.luas;
    }
    public double getKeliling() {
        return this.keliling;
    }
    public void setNama(String nama) {
        BangunDatar.nama = nama;
    }

    public void getInfo(){
        System.out.println("Nama: " + BangunDatar.nama);
        System.out.println("Luas: " + this.luas);
        System.out.println("Keliling: " + this.keliling);
    }
}
