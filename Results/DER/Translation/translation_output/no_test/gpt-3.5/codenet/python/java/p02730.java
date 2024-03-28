```java
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        boolean isPalindrome = s.equals(new StringBuilder(s).reverse().toString());
        boolean isPrePalindrome = pre.equals(new StringBuilder(pre).reverse().toString());
        boolean isSufPalindrome = suf.equals(new StringBuilder(suf).reverse().toString());

        if (isPalindrome && isPrePalindrome && isSufPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
