import java.util.Scanner;

public class p03315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int e = input.length() - input.replace("+", "").length();
        int f = input.length() - input.replace("-", "").length();
        System.out.println(e - f);
    }
}