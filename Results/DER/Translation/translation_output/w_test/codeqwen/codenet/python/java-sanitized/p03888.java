import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r1 = Integer.parseInt(input[0]);
        int r2 = Integer.parseInt(input[1]);
        System.out.printf("%.10f", 1.0 / ((r2 + r1) / (r1 * r2)));
    }
}