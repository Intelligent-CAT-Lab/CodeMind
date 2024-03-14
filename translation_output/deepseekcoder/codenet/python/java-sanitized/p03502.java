import java.util.Scanner;

public class p03502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String nStr = Integer.toString(n);
        char[] listN = nStr.toCharArray();
        int num = 0;
        for (char c : listN) {
            num += Character.getNumericValue(c);
        }
        String ans = "No";
        if (n % num == 0) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}