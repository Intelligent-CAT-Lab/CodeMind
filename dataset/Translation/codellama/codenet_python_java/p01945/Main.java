import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int N = input.indexOf('*');
        int P = Math.abs(input.substring(0, N).replace("(", "").length() - input.substring(0, N).replace(")", "").length());
        int Q = Math.abs(input.substring(N + 1, input.length()).replace("(", "").length() - input.substring(N + 1, input.length()).replace(")", "").length());
        System.out.println(Math.min(P, Q));
    }
}