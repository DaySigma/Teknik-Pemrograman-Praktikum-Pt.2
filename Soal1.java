import java.util.Scanner;

public class Soal1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan banyak angka yang ingin di cek: ");
        int T = scanner.nextInt();
        int i;

        for(i = 0; i <= T; i++){
            try{
                System.out.println("Masukkan jumlah angka yang ingin di cek: ");
                long N = scanner.nextLong();
                System.out.println("N can be fitted in: ");

                if(N >= Byte.MIN_VALUE && N <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(N >= Short.MIN_VALUE && N <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if(N >= Integer.MIN_VALUE && N <= Integer.MAX_VALUE) {
                    System.out.println("* Integer");
                }
                if(N >= Long.MIN_VALUE && N <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            }   catch (Exception e){
                System.out.println(scanner.next() + " can't be fitted anywhere");
            }
        }
    }
}