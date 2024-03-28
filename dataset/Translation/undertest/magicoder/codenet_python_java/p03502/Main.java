import java.util.Scanner;

public class p03502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String strN = String.valueOf(n);
        int num = 0;

        for (int i = 0; i < strN.length(); i++) {
            num += Integer.parseInt(String.valueOf(strN.charAt(i)));
        }
        String ans = "No";

        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}