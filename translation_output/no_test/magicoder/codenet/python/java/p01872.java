<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s = new StringBuilder(s).reverse().toString();
        Integer ans = check(s);
        System.out.println(ans != null ? ans : "MULTIPLE");
    }

    private static Integer check(String s) {
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
        return cnt == 1 ? ret : null;
    }

    private static boolean isCollect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(String.valueOf(fixedNumber.charAt(i))) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(String.valueOf(fixedNumber.charAt(i))) * (i - 5);
        }
        int last = 11 - score % 11;
        return String.valueOf(last).equals(String.valueOf(fixedNumber.charAt(0))) || (last >= 10 && String.valueOf(fixedNumber.charAt(0)).equals("0"));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, reverses it, and then calls the `check` method. The `check` method iterates over the digits 0-9, replaces the "?" with each digit, and checks if the modified string is a valid collect number. If it is, it increments a counter and sets the return value to the current digit. If the counter is 1, it returns the return value. If the counter is not 1, it returns null. If the return value is not null, it prints the return value. If the return value is null, it prints "MULTIPLE".<｜end▁of▁sentence｜>
