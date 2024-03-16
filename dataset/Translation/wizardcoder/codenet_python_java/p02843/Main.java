import java.util.Scanner;

public class p02843 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int q = N / 100;
        int mod = N % 100;
        int result = 1;
        if (mod > q * 5) {
            result = 0;
        }
        System.out.println(result);
    }
}