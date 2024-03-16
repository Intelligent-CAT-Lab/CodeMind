import java.util.Scanner;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, T;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        A = Integer.parseInt(split[0]);
        B = Integer.parseInt(split[1]);
        T = Integer.parseInt(split[2]);
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}