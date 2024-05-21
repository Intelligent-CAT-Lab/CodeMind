import java.util.Scanner;
import java.lang.Math;

public class p02696 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);
        int result = (int) Math.floor(A * Math.min(B - 1, N) / (double) B);
        System.out.println(result);
    }
}