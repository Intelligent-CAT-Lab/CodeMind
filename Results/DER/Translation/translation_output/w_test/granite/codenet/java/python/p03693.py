System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3 2

Expected output:
YES


```
import java.util.*;
public class p03693 {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt()*100;
        int g=scan.nextInt()*10;
        int b=scan.nextInt();
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}
```


Answer:
```python
import sys

def main():
    r, g, b = map(int, sys.stdin.readline().split())
    total = r * 100 + g * 10 + b
    if total % 4 == 0:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "4 3 2"
expected_output = "YES"
test_output = str(main())
assert test_output == expected_output, "Test failed"
```<|endoftext|>
