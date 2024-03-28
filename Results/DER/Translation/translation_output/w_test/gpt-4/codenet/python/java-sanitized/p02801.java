import java.util.Scanner;

public class p02801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char c = input.charAt(0);
        
        if(c >= 'a' && c < 'z') {
            char nextLetter = (char) (c + 1);
            System.out.println(nextLetter);
        } else if(c == 'z') { // Wrap around case 'z' -> 'a'
            System.out.println('a');
        } else {
            System.out.println("Invalid input"); // If the character is not in a-z
        }
        
        scanner.close();
    }
}