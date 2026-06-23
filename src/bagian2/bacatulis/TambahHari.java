package bagian2.bacatulis;

import java.io.*;

public class TambahHari {
    public static void main(String[] args) {

        try (PrintWriter penulis =
                     new PrintWriter(new FileWriter("hari.txt", true))) {

            penulis.println("Sabtu");
            penulis.println("Minggu");

            System.out.println("Data berhasil ditambahkan.");

        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        System.out.println("\nIsi file hari.txt:");

        try (BufferedReader pembaca =
                     new BufferedReader(new FileReader("hari.txt"))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
