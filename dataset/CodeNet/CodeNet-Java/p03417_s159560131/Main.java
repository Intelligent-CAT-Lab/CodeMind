import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        sc.close();

        System.out.println(Math.abs((n-2) * (m-2)));
    }
}
