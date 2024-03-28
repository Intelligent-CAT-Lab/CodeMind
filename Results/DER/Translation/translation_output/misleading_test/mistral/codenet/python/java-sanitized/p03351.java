import java.util.Scanner;

public class p03351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        String output = "JN6";
        if (Math.abs(a - c) <= d || Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
            output = "Yes";
        }
        System.out.println(output);
    }
}