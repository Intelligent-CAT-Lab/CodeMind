public class p01601 {
    public static void main(String[] args) {
        String n = "13";
        for (int i = 0; i < 100000; i++) {
            if (n.compareTo(new StringBuilder(n).reverse().toString()) >= 0 && isPalindrome(n.substring(0, n.length() - i))) {
                System.out.println(n.substring(0, n.length() - i));
                break;
            }
            if (isPalindrome(n.substring(0, n.length() + i))) {
                System.out.println(n.substring(0, n.length() + i));
                break;
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}