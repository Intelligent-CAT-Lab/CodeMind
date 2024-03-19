import java.util.Scanner;

public class p03840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int I = Integer.parseInt(tokens[0]);
        int J = Integer.parseInt(tokens[1]);
        int L = Integer.parseInt(tokens[2]);
        int O = Integer.parseInt(tokens[3]);

        int a = 0;
        if (I > 0 && J > 0 && L > 0) {
            a = ((I - 1) / 2 + (J - 1) / 2 + (L - 1) / 2) * 2 + 3 + O;
        }

        int b = (I / 2 + J / 2 + L / 2) * 2 + O;

        int ans = Math.max(a, b);

        System.out.println(ans);
    }
}