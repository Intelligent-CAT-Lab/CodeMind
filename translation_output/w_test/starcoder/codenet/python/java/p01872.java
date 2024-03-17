<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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
print(ans if ans!= None else "MULTIPLE")


```

java code:<fim_suffix><fim_middle>

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = s.indexOf("?");
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            String c = String.valueOf(i);
            String fixed_number = s.substring(0, index) + c + s.substring(index + 1);
            if (isCollect(fixed_number)) {
                cnt++;
                ret = i;
            }
        }
        if (cnt == 1)
            System.out.println(ret);
        else
            System.out.println("MULTIPLE");
    }

    public static boolean isCollect(String fixed_number) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(fixed_number.charAt(i) + "") * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(fixed_number.charAt(i) + "") * (i - 5);
        }
        int last = 11 - score % 11;
        if (last == 10)
            last = 0;
        if (last == Integer.parseInt(fixed_number.charAt(0) + ""))
            return true;
        else
            return false;
    }
}
```
<|endoftext|>
