<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
0


```
import java.util.*;

public class atcoder_ABC070_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] array = new int[101];
        
        for (int i = a; i < b; i++) {
            array[i]++;
        }
        
        for (int i = c; i < d; i++) {
            array[i]++;
        }
        
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            if (array[i] == 2) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```

### Response:
```python
import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    array = [0] * 101
    
    for i in range(a, b):
        array[i] += 1
        
    for i in range(c, d):
        array[i] += 1
        
    ans = sum(1 for i in range(101) if array[i] == 2)
    
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, counts the number of times each integer is in the range from 0 to 100, and then prints the number of integers that appear twice.
<|EOT|>
