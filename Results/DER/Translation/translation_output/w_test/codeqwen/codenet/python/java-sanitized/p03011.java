import java.util.Arrays;
import java.util.Scanner;

public class p03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = a + b + c - Arrays.stream(new int[]{a, b, c}).max().getAsInt();
        System.out.println(result);
    }
}