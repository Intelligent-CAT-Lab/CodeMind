<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
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
```

This Java code does the same thing as your Python code. It reads an integer from the input, then it iterates from 0 to 99999 (inclusive). For each number, it checks if the number minus the current iteration or the number plus the current iteration is a palindrome. If it is, it prints that number and stops the loop.

The `isPalindrome` method checks if a number is a palindrome by converting it to a string, then checking if the first and last characters are the same, then the second and second-to-last characters, and so on. If all pairs of characters are the same, it is a palindrome.
<|EOT|>
