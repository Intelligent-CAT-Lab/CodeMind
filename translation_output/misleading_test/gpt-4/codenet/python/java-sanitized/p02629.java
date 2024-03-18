import java.util.Scanner;

public class p02629 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            number--; // As Java's indexing is 0-based, we decrement first
            result.append((char) ('a' + number % 26));
            number /= 26;
        }
        System.out.println(result.reverse().toString());
    }
}