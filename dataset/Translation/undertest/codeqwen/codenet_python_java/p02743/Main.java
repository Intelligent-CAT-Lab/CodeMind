import java.util.Scanner;

public class p02743 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            System.out.println((4 * a * b < (c - a - b) * (c - a - b)) ? "Yes" : "No");
        }
    }
}