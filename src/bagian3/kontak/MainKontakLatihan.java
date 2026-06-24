package bagian3.kontak;

public class MainKontakLatihan {

    public static void main(String[] args) {

        BukuKontakLatihan buku =
                new BukuKontakLatihan("kontak.txt");

        buku.tambahKontak(
                new KontakLatihan(
                        "Andi",
                        "0811111",
                        "andi@gmail.com"));

        buku.tambahKontak(
                new KontakLatihan(
                        "Budi",
                        "0822222",
                        "budi@gmail.com"));

        buku.tambahKontak(
                new KontakLatihan(
                        "Citra",
                        "0833333",
                        "citra@gmail.com"));

        buku.tampilkanSemua();

        buku.simpanKeBerkas();

        System.out.println();

        buku.cariKontak("Budi");

        System.out.println();

        buku.hapusKontak("Budi");

        System.out.println("\nSetelah menghapus Budi:");
        buku.tampilkanSemua();

        System.out.println();

        BukuKontakLatihan bukuLain =
                new BukuKontakLatihan("kontak.txt");

        bukuLain.muatDariBerkas();

        bukuLain.tampilkanSemua();

        System.out.println("Jumlah kontak: "
                + bukuLain.jumlahKontak());
    }
}
