<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def main():
    x = [int(i) for i in input().split()]
    print(15 - sum(x))

if __name__ == "__main__":
    main()
```

In this Python code, we use the built-in `input().split()` function to read the input from the user. This function splits the input into a list of strings, and the `[int(i) for i in ...]` part converts these strings into integers. Then we use the built-in `sum()` function to calculate the sum of the numbers in the list. Finally, we print the result of `15 - sum`.
<|EOT|>
