import java.util.Scanner;

public class p02897 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double result = -(-N/2) / (double) N;
        System.out.println(result);
    }
}