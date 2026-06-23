package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class KelolaSementara {
    public static void main(String[] args) {
        File file = new File("sementara.txt");

        try {
            file.createNewFile();

            System.out.println("Sebelum dihapus:");
            System.out.println("Apakah file ada? " + file.exists());

            boolean berhasilHapus = file.delete();

            System.out.println("File berhasil dihapus? " + berhasilHapus);

            System.out.println("Sesudah dihapus:");
            System.out.println("Apakah file ada? " + file.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
