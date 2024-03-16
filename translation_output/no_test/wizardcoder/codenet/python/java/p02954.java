Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = str(input())
n = len(s)
rc = 0
lc = 0
p = 0
state = 1 #1ãRã0ãL
ans = [0] * n
for i in range(n):
  #print(ans, rc, lc, p)
  if state:
    if s[i] == "R":
      rc += 1
      if s[i+1] == "L":
        ans[i] += (rc+1)//2
        ans[i+1] += rc//2
        state = 0
        p = i
        rc = 0
  else:
    if s[i] == "L":
      lc += 1
      if i == n-1 or s[i+1] == "R":
        ans[p+1] += (lc+1)//2
        ans[p] += lc//2
        state = 1
        lc = 0
print(" ".join(map(str,ans)))
```

### Response:
```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();
    int rc = 0, lc = 0, p = 0, state = 1;
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      if (state == 1) {
        if (s.charAt(i) == 'R') {
          rc++;
          if (i < n-1 && s.charAt(i+1) == 'L') {
            ans[i] = (rc+1)/2;
            ans[i+1] = rc/2;
            state = 0;
            p = i;
            rc = 0;
          }
        }
      } else {
        if (s.charAt(i) == 'L') {
          lc++;
          if (i == n-1 || s.charAt(i+1) == 'R') {
            ans[p+1] = (lc+1)/2;
            ans[p] = lc/2;
            state = 1;
            lc = 0;
          }
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}
```<|endoftext|>
