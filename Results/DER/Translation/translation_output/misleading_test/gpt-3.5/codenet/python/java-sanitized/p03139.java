import java.util.Scanner;

public class p03139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);

        int min = Math.min(A, B);
        int max = Math.max(A + B - N, 0);

        System.out.println(min + " " + max);
    }
}