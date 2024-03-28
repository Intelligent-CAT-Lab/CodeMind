import java.util.Scanner;

public class p02612 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = (n % 1000 == 0) ? 1000 - n : 0;
        System.out.println(result);
    }
}