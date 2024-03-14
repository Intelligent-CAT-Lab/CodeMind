import java.util.Scanner;

public class p02729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        long even = (long) n * (n-1) / 2;
        long odd = (long) m * (m-1) / 2;

        System.out.println(even + odd);
    }
}