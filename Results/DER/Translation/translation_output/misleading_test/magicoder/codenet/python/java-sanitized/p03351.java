import java.util.Scanner;

public class p03351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);

        System.out.println(
            !(Math.abs(a - c) <= d || (Math.abs(a - b) <= d && Math.abs(b - c) <= d)) ? "JN6" : "YNeos"
        );
    }
}