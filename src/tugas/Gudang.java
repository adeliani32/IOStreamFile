package tugas;

import java.io.*;
import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> daftarBarang;

    public Gudang() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanSemua() {
        System.out.println("\n=== DAFTAR BARANG ===");

        for (Barang barang : daftarBarang) {
            System.out.println(barang.info());
        }
    }

    public void simpanKeBerkas(String namaFile) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(namaFile))) {

            for (Barang barang : daftarBarang) {
                pw.println(barang.keBaris());
            }

            System.out.println("\nData berhasil disimpan ke " + namaFile);

        } catch (IOException e) {
            System.out.println("Gagal menyimpan file: " + e.getMessage());
        }
    }

    public void muatDariBerkas(String namaFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {

            daftarBarang.clear();

            String baris;

            while ((baris = br.readLine()) != null) {
                String[] data = baris.split(",");

                String nama = data[0];
                double harga = Double.parseDouble(data[1]);
                int stok = Integer.parseInt(data[2]);

                daftarBarang.add(new Barang(nama, harga, stok));
            }

            System.out.println("\nData berhasil dimuat dari " + namaFile);

        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }
    }

    public double totalNilai() {
        double total = 0;

        for (Barang barang : daftarBarang) {
            total += barang.getHarga() * barang.getStok();
        }

        return total;
    }
}
