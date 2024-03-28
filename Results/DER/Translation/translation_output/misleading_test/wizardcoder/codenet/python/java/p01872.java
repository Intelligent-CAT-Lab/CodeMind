Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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
print(ans if ans!= None else "MULTIPLE")


```

### Response:
```java
import java.util.*;

public class Main {
  public static boolean isCollect(String fixedNumber) {
    int score = 0;
    for (int i = 1; i < 7; i++) {
      score += (fixedNumber.charAt(i) - '0') * (i + 1);
    }
    for (int i = 7; i < 12; i++) {
      score += (fixedNumber.charAt(i) - '0') * (i - 5);
    }
    int last = 11 - score % 11;
    if (last == 10) {
      return fixedNumber.charAt(0) == '0';
    } else {
      return last == (fixedNumber.charAt(0) - '0');
    }
  }

  public static int check(String s) {
    int index = s.indexOf('?');
    int cnt = 0;
    for (int i = 0; i < 10; i++) {
      String c = String.valueOf(i);
      String fixedNumber = s.substring(0, index) + c + s.substring(index + 1);
      if (isCollect(fixedNumber)) {
        cnt++;
        ret = i;
      }
    }
    if (cnt == 1) {
      return ret;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s = new StringBuilder(s).reverse().toString();
    int ans = check(s);
    System.out.println(ans == -1? "MULTIPLE" : ans);
  }
}
```<|endoftext|>
