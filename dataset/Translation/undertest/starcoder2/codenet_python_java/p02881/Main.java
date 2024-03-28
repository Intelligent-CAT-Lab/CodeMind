import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = (int) Math.sqrt(n);
        while (n % i != 0) {
            i--;
        }
        System.out.println(i + n / i - 2);
    }
}