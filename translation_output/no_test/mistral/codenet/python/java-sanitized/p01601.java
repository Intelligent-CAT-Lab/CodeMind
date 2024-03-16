public class p01601 {
    public static boolean isPalindrome(int n) {
        String nStr = Integer.toString(n);
        return nStr.equals(nStr.substring(0, nStr.length() - 1, -1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 100000; i <= n; i++) {
            if (n >= i && isPalindrome(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (isPalindrome(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }
}