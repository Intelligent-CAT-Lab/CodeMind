import java.util.Scanner;

public class p03605 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}