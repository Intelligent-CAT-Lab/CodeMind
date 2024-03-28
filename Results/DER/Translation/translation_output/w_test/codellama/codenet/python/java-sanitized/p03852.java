import java.util.Scanner;

public class p03852 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("a") || input.equals("i") || input.equals("u") || input.equals("e") || input.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}