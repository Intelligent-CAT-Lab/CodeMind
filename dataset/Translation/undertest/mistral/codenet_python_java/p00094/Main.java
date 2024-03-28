import java.util.Scanner;

public class p00094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        a = Integer.parseInt(split[0]);
        b = Integer.parseInt(split[1]);
        if (a <= 100 && b <= 100) {
            System.out.printf("%.4f", (a * b / 3.305785));
        }
    }
}