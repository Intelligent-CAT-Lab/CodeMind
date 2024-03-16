import java.util.Scanner;

public class p03778 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = Math.abs(a - b) < w ? 0 : Math.abs(a - b) - w;
        System.out.println(result);
    }
}