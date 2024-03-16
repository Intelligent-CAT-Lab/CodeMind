import java.util.Scanner;

public class p02705 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        double result = userInput * 6.28;
        System.out.println(result);
        scanner.close();
    }
}