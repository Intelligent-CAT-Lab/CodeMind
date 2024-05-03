import java.util.Scanner;

public class p03551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int time = 1900 * M + (N - M) * 100;
        System.out.println(time * (int) Math.pow(2, M));
    }
}