<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
13

Expected output:
11


```
def palind(n):
  return str(n) == str(n)[::-1]

n = input()
for i in range(100000):
  if n >= i and palind(n - i):
    print n - i
    break
  if palind(n + i):
    print n + i
    break
```
[/INST]
```java
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 100000; i++) {
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

    public static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        return s.equals(s.substring(0, s.length() - 1));
    }
}
```</s>
