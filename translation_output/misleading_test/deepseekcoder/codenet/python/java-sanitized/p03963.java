import java.util.Scanner;

public class p03963 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(k * (int)Math.pow((k - 1), (n - 1)));
    }
}