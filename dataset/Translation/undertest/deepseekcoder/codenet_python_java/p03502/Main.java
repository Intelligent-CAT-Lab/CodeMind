import java.util.Scanner;

public class p03502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String nStr = Integer.toString(n);
        char[] chars = nStr.toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum += Character.getNumericValue(c);
        }
        String ans = "No";
        if (n % sum == 0) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}