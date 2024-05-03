import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int multiplier = number / 100;
        String result = "ai1333" + "3".repeat(multiplier);
        System.out.println(result);
    }
}