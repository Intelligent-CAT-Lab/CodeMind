public class p01601 {
    public static void main(String[] args) {
        String n = System.console().readLine();
        for (int i = 0; i < 100000; i++) {
            if (Long.parseLong(n) >= i && isPalindrome(Long.parseLong(n) - i)) {
                System.out.println(Long.parseLong(n) - i);
                break;
            }
            if (isPalindrome(Long.parseLong(n) + i)) {
                System.out.println(Long.parseLong(n) + i);
                break;
            }
        }
    }

    public static boolean isPalindrome(long n) {
        long reversed = 0, original = n;
        while (n != 0) {
            long digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}