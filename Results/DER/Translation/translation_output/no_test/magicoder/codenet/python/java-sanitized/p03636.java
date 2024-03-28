import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("");
        String a = parts[0];
        String c = parts[parts.length - 1];
        StringBuilder b = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
            b.append(parts[i]);
        }
        System.out.println(a + b.length() + c);
    }
}