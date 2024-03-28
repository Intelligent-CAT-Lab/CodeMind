import java.util.Scanner;

public class p03834 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}