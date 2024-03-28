import java.util.Scanner;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        long N = Long.parseLong(inputs[0]);
        long A = Long.parseLong(inputs[1]);
        long B = Long.parseLong(inputs[2]);

        long ans = N / (A + B) * A;
        long rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}