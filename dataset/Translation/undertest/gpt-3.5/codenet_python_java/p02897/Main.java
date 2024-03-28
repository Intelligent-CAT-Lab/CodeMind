import java.util.Scanner;

public class p02897 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double result = Math.ceil((double) N / 2) / N;
        System.out.printf("%.10f%n", result);
    }
}