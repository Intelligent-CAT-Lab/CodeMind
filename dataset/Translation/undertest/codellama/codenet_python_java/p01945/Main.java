import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int N = input.indexOf('*');
        int P = Math.abs(input.substring(0, N).chars().filter(c -> c == '(').count() - input.substring(0, N).chars().filter(c -> c == ')').count());
        int Q = Math.abs(input.substring(N + 1).chars().filter(c -> c == '(').count() - input.substring(N + 1).chars().filter(c -> c == ')').count());
        System.out.println(Math.min(P, Q));
    }
}