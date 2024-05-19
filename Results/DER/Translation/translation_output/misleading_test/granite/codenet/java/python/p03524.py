System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abac

Expected output:
#3S

```
import java.util.*;

public class p03524 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int a = 0, b = 0, c = 0;
    for (int i = 0; i < S.length(); i++) {
      char x = S.charAt(i);
      if (x == 'a') a++;
      if (x == 'b') b++;
      if (x == 'c') c++;
    }
    if (Math.max(Math.max(a,b),c)-Math.min(Math.min(a,b),c) <= 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    } 
  }
}

```


Answer:
```python
def main():
    S = input()
    a = S.count('a')
    b = S.count('b')
    c = S.count('c')
    if max(a, b, c) - min(a, b, c) <= 1:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

Test input:
```
abac
```

Expected output:
```
YES
```<|endoftext|>
