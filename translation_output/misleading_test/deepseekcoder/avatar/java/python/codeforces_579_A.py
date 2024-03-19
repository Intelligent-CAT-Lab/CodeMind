<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9

Expected output:
48

```
import java.util.*;
import java.util.ArrayList;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        String s = " ";
        
        while (n > 0) {
            int x = n % 2;
            n /= 2;
            s += x + " ";
        }
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```

### Response:
```python
def count_ones(n):
    s = ""
    while n > 0:
        x = n % 2
        n //= 2
        s += str(x) + " "
    return s.count('1')

n = int(input())
print(count_ones(n))
```

This Python code does the same thing as the Java code. It reads an integer from the input, converts it to binary, and counts the number of 1s in the binary representation. The count_ones function does the conversion and counting, and the main part of the program reads the input and prints the result.
<|EOT|>
