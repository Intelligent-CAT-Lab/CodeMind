import java.util.Scanner;

public class p02137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = (int) Math.floor(input / 500.0) * 500;
        System.out.println(result);
    }
}