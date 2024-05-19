System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
public class Main {
    public static boolean isCollect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(fixedNumber.substring(i, i + 1)) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(fixedNumber.substring(i, i + 1)) * (i - 5);
        }
        int last = 11 - score % 11;
        if (String.valueOf(last).equals(fixedNumber.substring(0, 1)) || (last >= 10 && fixedNumber.substring(0, 1).equals("0"))) {
            return true;
        } else {
            return false;
        }
    }

    public static int check(String s) {
        int index = s.indexOf("?");
        int cnt = 0;
        int ret = -1;
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
        String s = new StringBuilder(new String(java.util.Scanner.class.getDeclaredMethod("nextLine", new Class<?>[]{}).invoke(java.util.Scanner.class.getDeclaredMethod("nextLine", new Class<?>[]{}).invoke(new java.util.Scanner(System.in), new Object[]{}), new Object[]{})).reverse().toString();
        int ans = check(s);
        if (ans!= -1) {
            System.out.println(ans);
        } else {
            System.out.println("MULTIPLE");
        }
    }
}
```<|endoftext|>
