import java.util.Scanner;

public class p00006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = input.substring(0, input.length() - 1).reverse();
        System.out.println(reversed);
    }
}