import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String a = parts[0];
        String[] b = new String[parts.length - 2];
        for (int i = 1; i < parts.length - 1; i++) {
            b[i - 1] = parts[i];
        }
        String c = parts[parts.length - 1];
        String result = a + String.valueOf(b.length) + c;
        System.out.println(result);
    }
}