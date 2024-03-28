import java.util.Scanner;

public class p02137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = (input / 500) * 500;
        System.out.println(output);
        scanner.close();
    }
}