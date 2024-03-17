import java.util.Scanner;

public class p03502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String list_N = Integer.toString(n);
        int num = 0;

        for (int i = 0; i < list_N.length(); i++) {
            num += Integer.parseInt(list_N.charAt(i) + "");
        }

        String ans = "No";

        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}