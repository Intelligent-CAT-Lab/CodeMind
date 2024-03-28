import java.util.Scanner;

public class p03107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int N = input.length();
        int C0 = input.count("0");
        int C1 = input.count("1");
        System.out.println(2 * Math.min(C0, C1));
    }
}