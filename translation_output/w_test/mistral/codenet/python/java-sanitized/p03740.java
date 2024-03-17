import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String output = "Brown";
        if (Math.abs(x - y) > 1) {
            output = "Alice";
        }
        System.out.println(output);
    }
}