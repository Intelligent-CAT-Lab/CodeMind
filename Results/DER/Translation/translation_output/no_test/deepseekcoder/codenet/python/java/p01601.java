<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
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

This Java code does the same thing as the Python code. It reads an integer from the standard input, then it iterates over the numbers from 0 to 99999. For each number, it checks if the number minus the current iteration (n - i) or the number plus the current iteration (n + i) is a palindrome. If it is, it prints the number and stops the loop.

The `isPalindrome` method checks if a number is a palindrome by converting it to a string, then checking if the string is the same when reversed.
<|EOT|>
