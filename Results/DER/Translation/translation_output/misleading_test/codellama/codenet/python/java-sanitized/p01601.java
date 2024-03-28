public class p01601 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    for (int i = 0; i < 100000; i++) {
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

  private static boolean isPalindrome(int num) {
    String str = String.valueOf(num);
    return str.equals(new StringBuilder(str).reverse().toString());
  }
}