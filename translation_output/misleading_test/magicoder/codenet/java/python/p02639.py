<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 2 3 4 5

Expected output:
-77

```
import java.util.*;

public class p02639 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            x[i] = sc.nextInt();
            sum += x[i];
        }
        System.out.println(15-sum);
    }

}

```

@@ Response
```python
# Python code

# Read input
x = list(map(int, input().split()))

# Calculate sum
sum_x = sum(x)

# Print result
print(15 - sum_x)
```

Test input:
0 2 3 4 5

Expected output:
-77<｜end▁of▁sentence｜>
