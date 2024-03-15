Solution


public class p01601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 100000; i >= 0; i--) {
            if (n >= i && palindrome(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (palindrome(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }

    public static boolean palindrome(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}