<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-52

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

def count_ways(k, s):
    count = 0
    for x in range(k+1):
        for y in range(k+1):
            z = s - x - y
            if 0 <= z <= k:
                count += 1
    return count

k, s = map(int, sys.stdin.readline().split())
print(count_ways(k, s))
```

In this Python code, we define a function `count_ways` that takes two parameters `k` and `s`. This function iterates over all possible values of `x` and `y` from 0 to `k`, calculates `z` as `s - x - y`, and checks if `z` is between 0 and `k` (inclusive). If it is, it increments the count. The function returns the count.

The values of `k` and `s` are read from the standard input using `sys.stdin.readline().split()`, which splits the input into a list of strings. `map` is used to convert these strings to integers.

Finally, the function `count_ways` is called with `k` and `s` as arguments, and the result is printed to the standard output.
<|EOT|>
