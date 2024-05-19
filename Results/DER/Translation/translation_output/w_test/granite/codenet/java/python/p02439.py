System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5 3

Expected output:
3 5


```
import java.util.*;
public class p02439 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(Math.min(min,c)+" "+Math.max(max,c));
    }
}

```


Answer:
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    min_ab = min(a, b)
    max_ab = max(a, b)
    min_abc = min(min_ab, c)
    max_abc = max(max_ab, c)
    print(min_abc, max_abc)

if __name__ == "__main__":
    main()
```

Test input:
```
4 5 3
```

Expected output:
```
3 5
```<|endoftext|>
