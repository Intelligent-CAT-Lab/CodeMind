import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        String a = parts[0];
        String c = parts[2];
        String b = parts[1].replace("*", "");
        System.out.println(a + b.length() + c);
    }
}