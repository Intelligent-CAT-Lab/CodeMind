import java.util.Scanner;

public class p00006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(new StringBuilder(input).reverse().toString());
    }
}