import java.util.Scanner;

public class p02879 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        if (0 < a && a < 10 && 0 < b && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println("-1");
        }

        scanner.close();
    }
}