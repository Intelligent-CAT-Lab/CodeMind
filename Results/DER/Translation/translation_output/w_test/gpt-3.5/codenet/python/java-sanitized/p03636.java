import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split("");
        String a = parts[0];
        String b = String.valueOf(parts.length - 2);
        String c = parts[parts.length - 1];

        System.out.println(a + b + c);
    }
}