import java.util.Scanner;

public class p03577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.substring(0, input.length() - 8));
        scanner.close();
    }
}