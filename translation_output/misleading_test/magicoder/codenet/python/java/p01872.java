<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
?12345678901

Expected output:
-21

```
def is_collect(fixed_number):
  score = 0
  for i in range(1, 7):
    score += int(fixed_number[i]) * (i + 1)
  for i in range(7, 12):
    score += int(fixed_number[i]) * (i - 5)
  last = 11 - score % 11
  if str(last) == fixed_number[0] or (last >= 10 and fixed_number[0] == "0"):
    return True
  else:
    return False

def check(s):
  index = s.index("?")
  cnt = 0
  for i in range(10):
    c = str(i)
    fixed_number = s[:index] + c + s[index + 1:]
    if is_collect(fixed_number):
      cnt += 1
      ret = i
  if cnt == 1:return ret
  else:return None

ans = check(input()[::-1])
print(ans if ans != None else "MULTIPLE")


```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ans = check(new StringBuilder(s).reverse().toString());
        System.out.println(ans != -1 ? ans : "MULTIPLE");
    }

    public static int check(String s) {
        int index = s.indexOf("?");
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            String c = String.valueOf(i);
            String fixedNumber = s.substring(0, index) + c + s.substring(index + 1);
            if (isCollect(fixedNumber)) {
                cnt++;
                ret = i;
            }
        }
        return cnt == 1 ? ret : -1;
    }

    public static boolean isCollect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(String.valueOf(fixedNumber.charAt(i))) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(String.valueOf(fixedNumber.charAt(i))) * (i - 5);
        }
        int last = 11 - score % 11;
        return String.valueOf(last).equals(String.valueOf(fixedNumber.charAt(0))) || (last >= 10 && fixedNumber.charAt(0) == '0');
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, reverses it, and then calls the `check` function. The `check` function iterates over all possible values for the "?" character, checks if the number is valid, and counts the number of valid numbers. If there is exactly one valid number, it returns that number. If there are multiple valid numbers or no valid numbers, it returns -1. The `isCollect` function calculates the score for a given number and checks if it is valid.<｜end▁of▁sentence｜>
