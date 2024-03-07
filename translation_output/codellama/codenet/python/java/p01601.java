<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
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

  private static boolean isPalindrome(int n) {
    String str = String.valueOf(n);
    return str.equals(new StringBuilder(str).reverse().toString());
  }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` and `StringBuilder` classes to manipulate strings. The `isPalindrome` method checks if a given number is a palindrome by converting it to a string and then checking if it is equal to its reverse. The `main` method uses a `for` loop to iterate from 0 to 100000, and checks if the input number is a palindrome or if its reverse is a palindrome. If either condition is true, it prints the result and breaks out of the loop.</s>
