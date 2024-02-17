import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        String strn = String.valueOf(n);
        int len = strn.length();

        String ans;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Integer.parseInt(strn.substring(i, i + 1));
        }
        if (n % sum == 0) ans = "Yes";
        else ans = "No";

        System.out.println(ans);
    }
}