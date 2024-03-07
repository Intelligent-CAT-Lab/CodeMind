import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        String a = tokens[0];
        String b = tokens[1];
        String c = tokens[2];
        System.out.println(a + b.length() + c);
    }
}