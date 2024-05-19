System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abac

Expected output:
YES


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
    a = 0
    b = 0
    c = 0
    for x in S:
        if x == 'a':
            a += 1
        elif x == 'b':
            b += 1
        elif x == 'c':
            c += 1
    if max(a, b, c) - min(a, b, c) <= 1:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("abac", "YES"),
    ("abba", "NO"),
    ("aa", "YES"),
    ("bb", "YES"),
    ("cc", "YES"),
]
for input, expected_output in test_inputs:
    with patch('builtins.input', return_value=input):
        main()
        captured = capsys.readouterr()
        assert captured.out.strip() == expected_output
```<|endoftext|>
