import java.util.Scanner;

public class p00006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String output = new StringBuilder(input).reverse().toString();
        System.out.println(output);
    }
}