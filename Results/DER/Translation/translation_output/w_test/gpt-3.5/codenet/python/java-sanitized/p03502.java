import java.util.Scanner;

public class p03502 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] list_N = Integer.toString(n).split("");
        int num = 0;

        for (String digit : list_N) {
            num += Integer.parseInt(digit);
        }

        String ans = "No";

        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}