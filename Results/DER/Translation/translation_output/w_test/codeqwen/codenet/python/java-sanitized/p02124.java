import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int number = input / 100;
        String output = "ai1333" + "3".repeat(number);
        System.out.println(output);
    }
}