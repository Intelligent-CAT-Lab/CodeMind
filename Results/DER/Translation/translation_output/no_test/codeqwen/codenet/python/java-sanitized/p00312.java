import java.util.Scanner;

public class p00312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int D = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        int ans = D / L + (D - L * (D / L));
        System.out.println(ans);
    }
}