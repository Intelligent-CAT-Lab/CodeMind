<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### Solution

```java
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 100000; i >= 0; i--) {
            if (n >= i && palindrome(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (palindrome(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }

    public static boolean palindrome(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
```
</s>
