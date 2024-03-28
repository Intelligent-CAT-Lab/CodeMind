<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03671{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] sum = {a,b,c};
        Arrays.sort(sum);

        System.out.println(sum[0]+sum[1]);
    }

}

```

### Response:
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())

    nums = [a, b, c]
    nums.sort()

    print(nums[0] + nums[1])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, sorts them in ascending order, and then prints the sum of the two smallest integers.
<|EOT|>
