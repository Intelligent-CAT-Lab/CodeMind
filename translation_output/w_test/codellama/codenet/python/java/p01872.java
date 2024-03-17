<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
?12345678901

Expected output:
4


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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversedInput = new StringBuilder(input).reverse().toString();
        int index = reversedInput.indexOf("?");
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            String fixedNumber = reversedInput.substring(0, index) + i + reversedInput.substring(index + 1);
            if (isCollect(fixedNumber)) {
                cnt++;
                int ret = i;
            }
        }
        if (cnt == 1) {
            System.out.println(ret);
        } else {
            System.out.println("MULTIPLE");
        }
    }

    public static boolean isCollect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(fixedNumber.charAt(i)) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(fixedNumber.charAt(i)) * (i - 5);
        }
        int last = 11 - score % 11;
        if (String.valueOf(last).equals(fixedNumber.charAt(0)) || (last >= 10 && fixedNumber.charAt(0) == '0')) {
            return true;
        } else {
            return false;
        }
    }
}
```
This is a Java implementation of the Python code provided. The `isCollect` method is the same as the Python function, and the `check` method is implemented in a similar way. The main method first reverses the input string, then finds the index of the "?" character, and then iterates through the digits 0-9 to find the correct digit that makes the `isCollect` method return true. If there is only one such digit, it is printed, otherwise "MULTIPLE" is printed.</s>
