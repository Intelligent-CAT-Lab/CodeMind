import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        scanner.close();

        String output = "ai1333" + "3".repeat(inputValue / 100);
        System.out.println(output);
    }
}