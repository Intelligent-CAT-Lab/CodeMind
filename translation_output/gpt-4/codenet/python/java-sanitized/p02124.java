import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        String output = "ai1333" + "3".repeat(inputNumber / 100);
        System.out.println(output);

        scanner.close();
    }
}