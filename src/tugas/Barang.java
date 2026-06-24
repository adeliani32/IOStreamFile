package tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mengubah data menjadi satu baris untuk disimpan ke file
    public String keBaris() {
        return nama + "," + harga + "," + stok;
    }

    // Menampilkan informasi barang
    public String info() {
        return "Nama: " + nama +
               ", Harga: Rp" + harga +
               ", Stok: " + stok;
    }
}
