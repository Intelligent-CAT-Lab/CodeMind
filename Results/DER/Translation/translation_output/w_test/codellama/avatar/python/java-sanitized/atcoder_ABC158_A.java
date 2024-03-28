import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "No";
        if (input.contains("A") && input.contains("B")) {
            result = "Yes";
        }
        System.out.println(result);
    }
}