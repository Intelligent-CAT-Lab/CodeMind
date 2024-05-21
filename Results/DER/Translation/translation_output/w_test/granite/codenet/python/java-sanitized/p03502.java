import java.util.Scanner;

public class p03502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String numString = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum += Character.getNumericValue(numString.charAt(i));
        }
        String ans = "No";
        if (n % sum == 0) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}