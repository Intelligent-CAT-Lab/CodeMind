import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String a = String.valueOf(input.charAt(0));
        String b = input.substring(1, input.length() - 1);
        String c = String.valueOf(input.charAt(input.length() - 1));
        System.out.println(a + b.length() + c);
    }
}