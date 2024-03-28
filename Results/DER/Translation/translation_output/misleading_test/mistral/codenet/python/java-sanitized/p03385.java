import java.util.Scanner;

public class p03385 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contains("a") && input.contains("b") && input.contains("c")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}