import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        int x = N;
        while (x > 0) {
            total += x % 10;
            x = x / 10;
        }
        System.out.println(total);
    }
}