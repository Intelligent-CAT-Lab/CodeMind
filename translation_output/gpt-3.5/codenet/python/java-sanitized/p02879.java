import java.util.Scanner;

public class p02879 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split();
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if (a > 0 && a < 10 && b > 0 && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println("-1");
        }
    }
}