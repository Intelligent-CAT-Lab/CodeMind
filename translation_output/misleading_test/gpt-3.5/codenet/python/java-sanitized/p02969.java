import java.util.Scanner;

public class p02969 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int result = 3 * (int) Math.pow(r, 2);
        System.out.println(result);
    }
}