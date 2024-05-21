import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result;
        if (n * Math.sqrt(2) < Math.ceil(n) + 1) {
            result = n * Math.sqrt(2);
        } else {
            result = Math.ceil(n) + 1;
        }
        System.out.println(result);
    }
}