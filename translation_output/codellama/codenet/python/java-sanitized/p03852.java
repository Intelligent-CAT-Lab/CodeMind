import java.util.Scanner;

public class p03852 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();
        if (input.equals("a") || input.equals("i") || input.equals("u") || input.equals("e") || input.equals("o")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}