package tugas;

// Nama : Adeliani
// NPM  : 2410010047

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
                "Makanan",
                "Minuman",
                "Elektronik"
        };

        System.out.println("=== KATEGORI BARANG ===");
        for (String k : kategori) {
            System.out.println("- " + k);
        }

        // Membuat gudang
        Gudang gudang = new Gudang();

        // Menambahkan minimal 5 barang
        gudang.tambahBarang(new Barang("Beras", 15000, 20));
        gudang.tambahBarang(new Barang("Gula", 14000, 15));
        gudang.tambahBarang(new Barang("Teh", 8000, 30));
        gudang.tambahBarang(new Barang("Lampu LED", 25000, 10));
        gudang.tambahBarang(new Barang("Sabun", 5000, 25));

        // Menampilkan barang
        gudang.tampilkanSemua();

        // Menampilkan total nilai
        System.out.println("\nTotal Nilai Persediaan: Rp" +
                gudang.totalNilai());

        // Simpan ke file
        String namaFile = "barang.txt";
        gudang.simpanKeBerkas(namaFile);

        // Membuat objek gudang baru
        Gudang gudangBaru = new Gudang();

        // Memuat data dari file
        gudangBaru.muatDariBerkas(namaFile);

        // Menampilkan data hasil baca file
        gudangBaru.tampilkanSemua();

        // Menampilkan total nilai setelah dimuat
        System.out.println("\nTotal Nilai Persediaan Setelah Dimuat: Rp"
                + gudangBaru.totalNilai());
    }
}
