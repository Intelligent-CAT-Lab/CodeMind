<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anser = 0;
        int[] count = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            count[i] += x;
            
            if (count[i] == 0) {
                anser = i;
            }
        }
        
        System.out.println(anser + 1);
    }
}
```

### Response:
```python
import sys

def atcoder_ABC170_A():
    count = [0]*5
    for i in range(5):
        x = int(sys.stdin.readline().strip())
        count[i] += x
        if count[i] == 0:
            ans = i
    print(ans + 1)

atcoder_ABC170_A()
```

This Python code does the same thing as the Java code. It reads five integers from the standard input, stores them in the `count` list, and prints the index of the first zero in the list plus one. The `sys.stdin.readline().strip()` function is used to read the input from the standard input.
<|EOT|>
