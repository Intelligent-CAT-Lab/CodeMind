<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
public class Main {
    public static boolean is_collect(String fixed_number) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(fixed_number.charAt(i)) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(fixed_number.charAt(i)) * (i - 5);
        }
        int last = 11 - score % 11;
        if (last == Integer.parseInt(fixed_number.charAt(0)) || (last >= 10 && fixed_number.charAt(0) == '0')) {
            return true;
        } else {
            return false;
        }
    }

    public static int check(String s) {
        int index = s.indexOf("?");
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            String c = Integer.toString(i);
            String fixed_number = s.substring(0, index) + c + s.substring(index + 1);
            if (is_collect(fixed_number)) {
                cnt++;
                return i;
            }
        }
        if (cnt == 1) {
            return -1;
        } else {
            return -2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(0, s.length() - 1);
        int ans = check(s);
        if (ans == -1) {
            System.out.println("MULTIPLE");
        } else {
            System.out.println(ans);
        }
    }
}
```</s>
