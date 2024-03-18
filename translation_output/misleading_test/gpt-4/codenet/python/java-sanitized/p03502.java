import java.util.Scanner;

public class p03502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String list_N = String.valueOf(n);
        int num = 0;

        for (int i = 0; i < list_N.length(); i++) {
            num += Character.getNumericValue(list_N.charAt(i));
        }
        String ans = "No";

        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
        scanner.close();
    }
}