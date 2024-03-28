<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    x = list(map(int, sys.stdin.readline().split()))
    sum = 0
    for i in range(5):
        sum += x[i]
    print(15 - sum)

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input string to a list of integers, and the `split` method is used to split the input string into a list of strings. The `int` function is used to convert each string to an integer. The `range` function is used to iterate over the list of integers.</s>
