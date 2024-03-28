import java.util.Scanner;

public class p03416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        
        int count = 0;
        for (int i = f; i <= t; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    public static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        String reversed = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversed);
    }
}