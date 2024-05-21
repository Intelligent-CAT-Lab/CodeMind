import java.util.Scanner;

public class p02399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int div = a / b;
        int mod = a % b;
        float floatDiv = (float) a / b;
        System.out.printf("%d %d %f", div, mod, floatDiv);
    }
}