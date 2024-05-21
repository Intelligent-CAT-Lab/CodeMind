import java.util.Scanner;

public class p03139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        System.out.println(Math.min(A, B) + " " + Math.max(A + B - N, 0));
    }
}