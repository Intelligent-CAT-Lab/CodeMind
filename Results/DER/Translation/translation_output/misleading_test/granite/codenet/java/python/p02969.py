System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
68

```
import java.util.*;

class p02969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a*a*3);
    }
}


```


Answer:
```python
import sys

def main():
    a = int(sys.stdin.read())
    print(a*a*3)

if __name__ == "__main__":
    main()
```

Test input:
```
4
```

Expected output:
```
68
```<|endoftext|>
