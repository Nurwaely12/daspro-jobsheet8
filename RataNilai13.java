import java.util.Scanner;
public class RataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        float totalNilai, rataNilai, nilaiMhs;
        for (i = 1; i <= 5; i++) {
            System.out.println("Input Nilai Mahasiswa ke " + i + ":");
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextFloat(); 
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;

            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
        }


    }
}
