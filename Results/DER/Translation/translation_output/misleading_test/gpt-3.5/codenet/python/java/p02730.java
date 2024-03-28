```java
import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        boolean isPalindrome = s.equals(new StringBuilder(s).reverse().toString());
        boolean prePalindrome = pre.equals(new StringBuilder(pre).reverse().toString());
        boolean sufPalindrome = suf.equals(new StringBuilder(suf).reverse().toString());
        
        if (isPalindrome && prePalindrome && sufPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
```
```console
Input: akasaka
Output: No
```
