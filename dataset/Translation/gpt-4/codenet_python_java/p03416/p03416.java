import java.util.Scanner;

public class p03416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();

        int count = 0;
        for (int i = f; i <= t; i++) {
            if (isPalindrome(Integer.toString(i))) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}