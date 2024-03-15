import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(",");
        String a = values[0];
        String b = values[1];
        String c = values[2];
        System.out.println(a + Integer.toString(b.length()) + c);
    }
}