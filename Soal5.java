import java.util.Scanner;

public class Soal5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dua string
        String A = scanner.next();
        String B = scanner.next();

        // 1. Menjumlahkan panjang A dan B
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);

        // 2. Menentukan urutan leksikografis
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Kapitalisasi huruf pertama dan mencetak hasil
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
