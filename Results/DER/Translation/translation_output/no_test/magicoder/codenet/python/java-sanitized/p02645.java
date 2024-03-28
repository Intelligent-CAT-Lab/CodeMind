import java.util.Scanner;

public class p02645 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() >= 3) {
            System.out.println(input.substring(0, 3));
        } else {
            System.out.println(input);
        }
    }
}