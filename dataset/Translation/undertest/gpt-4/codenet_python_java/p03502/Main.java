import java.util.Scanner;

public class p03502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = Integer.toString(n);
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            num += Character.getNumericValue(s.charAt(i));
        }

        String ans = "No";
        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
        scanner.close();
    }
}