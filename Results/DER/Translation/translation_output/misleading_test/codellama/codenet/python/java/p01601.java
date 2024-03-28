<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
13

Expected output:
24

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
public class Palindrome {
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
```
This code takes an integer `n` as input and checks if it is a palindrome. If it is, it prints the number. If it is not, it checks if the number is a palindrome when it is added to or subtracted from `i` (where `i` is an integer between 0 and 100000). If it is, it prints the result. If it is not, it continues checking until it finds a palindrome or reaches the end of the loop.

Note that the `isPalindrome` method is a helper function that takes an integer `num` and checks if it is a palindrome by converting it to a string and checking if it is equal to its reverse.</s>
