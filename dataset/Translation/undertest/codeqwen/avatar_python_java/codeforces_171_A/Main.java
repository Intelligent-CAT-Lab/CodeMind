import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String a = parts[0];
        String b = new StringBuilder(parts[1]).reverse().toString();
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(sum);
    }
}