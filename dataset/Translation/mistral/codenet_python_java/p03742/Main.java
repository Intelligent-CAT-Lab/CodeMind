import java.util.Scanner;

public class p03742 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result = "Alice";
        if (Math.abs(a - b) <= 1) {
            result = "Brown";
        }
        System.out.println(result);
    }
}