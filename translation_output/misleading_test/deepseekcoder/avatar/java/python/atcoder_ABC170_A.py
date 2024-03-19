<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 0

Expected output:
35

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
def atcoder_ABC170_A():
    count = [0]*5
    for i in range(5):
        x = int(input())
        count[i] += x
        if count[i] == 0:
            return i+1

print(atcoder_ABC170_A())
```

This Python code does the same thing as the Java code. It reads in 5 integers from the user, stores them in the `count` list, and then returns the index of the first zero in the list (plus 1 because the problem statement is 1-indexed).
<|EOT|>
