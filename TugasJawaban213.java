import java.util.Scanner;

public class TugasJawaban213 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Masukkan jumlah politeknik yang ikut serta
        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = input.nextInt();
        input.nextLine(); // Untuk menghindari masalah input

        // Array untuk menyimpan data atlet masing-masing cabang olahraga
        String[][][] atlet = new String[jumlahPoliteknik][4][5];
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};

        // Input data atlet untuk setiap politeknik
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + (i + 1) + ":");
            for (int j = 0; j < 4; j++) { // 4 cabang olahraga
                System.out.println("Masukkan nama atlet untuk cabang " + cabangOlahraga[j] + ":");
                for (int k = 0; k < 5; k++) { // 5 atlet per cabang olahraga
                    System.out.print("Atlet " + (k + 1) + ": ");
                    atlet[i][j][k] = input.nextLine();
                }
            }
        }

        // Menampilkan data atlet yang telah dimasukkan
        System.out.println("\nDaftar Atlet dari Setiap Politeknik:");
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.println("Cabang " + cabangOlahraga[j] + ":");
                for (int k = 0; k < 5; k++) {
                    System.out.println("Atlet " + (k + 1) + ": " + atlet[i][j][k]);
                }
            }
        }

        input.close();
    }
}