import java.util.Scanner;

public class p03416 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();
        
        System.out.println(countPalindromesInRange(f, t));
    }

    private static int countPalindromesInRange(int from, int to) {
        int count = 0;
        for (int i = from; i <= to; i++) {
            if (isPalindrome(Integer.toString(i))) {
                count++;
            }
        }
        return count;
    }
    
    private static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}