<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 100000; i >= 0; i--) {
            if (n >= i && isPalind(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (isPalind(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }

    public static boolean isPalind(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i)!= s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
```
<|endoftext|>
