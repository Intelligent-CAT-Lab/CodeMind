import java.util.Scanner;

public class p02341 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = n <= k? 1 : 0;
        System.out.println(result);
    }
}