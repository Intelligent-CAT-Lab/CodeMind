<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
6


```
import java.util.*;

public class p03835{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int k = scan.nextInt();
        int s = scan.nextInt();


        // search
        int count = 0;
        for(int x = 0; x <= k; x++){
            for(int y = 0; y <= k; y++){
                int z = s - x - y;
                if(z >= 0 && z <= k){
                    count++;
                }
            }
        }


        // answer
        System.out.println(count);

    }
}
```

### Response:
```python
import sys

def count_combinations(k, s):
    count = 0
    for x in range(k+1):
        for y in range(k+1):
            z = s - x - y
            if 0 <= z <= k:
                count += 1
    return count

k, s = map(int, sys.stdin.readline().split())
print(count_combinations(k, s))
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then counts the number of combinations of `x`, `y`, and `z` such that `x`, `y`, and `z` are non-negative and less than or equal to `k`, and `x` + `y` + `z` equals `s`. The result is printed to the standard output.
<|EOT|>
