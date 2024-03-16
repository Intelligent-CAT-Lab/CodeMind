import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String result = "Brown" + (Math.abs(x - y) <= 1 ? "" : "Alice");
        System.out.println(result);
    }
}