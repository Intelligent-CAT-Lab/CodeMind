import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word for abbreviation:");
        String input = scanner.nextLine();
        scanner.close();
        
        if (input.length() <= 2) {
            System.out.println(input);
        } else {
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(input.length() - 1);
            int count = input.length() - 2;
            
            System.out.println(firstChar + "" + count + lastChar);
        }
    }
}