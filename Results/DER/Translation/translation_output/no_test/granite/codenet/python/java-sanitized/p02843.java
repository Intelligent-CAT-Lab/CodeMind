import java.util.Scanner;

public class p02843 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int q = N / 100;
        int mod = N % 100;
        int result = mod <= q * 5? 1 : 0;
        System.out.println(result);
    }
}