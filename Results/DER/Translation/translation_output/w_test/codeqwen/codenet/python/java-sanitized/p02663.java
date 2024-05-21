import java.util.Scanner;

public class p02663 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int t1 = 60*h1 + m1;
        int t2 = 60*h2 + m2;

        System.out.println(t2-t1-k);
    }
}