import java.util.Scanner;

public class p03359 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a, b;
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);

        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}