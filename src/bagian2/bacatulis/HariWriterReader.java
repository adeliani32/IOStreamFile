package bagian2.bacatulis;

import java.io.*;

public class HariWriterReader {
    public static void main(String[] args) {

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {

            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");

            System.out.println("Data hari berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
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
