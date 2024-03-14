<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    k, s = map(int, sys.stdin.readline().split())

    # search
    count = 0
    for x in range(k+1):
        for y in range(k+1):
            z = s - x - y
            if 0 <= z <= k:
                count += 1

    # answer
    print(count)

if __name__ == "__main__":
    main()
```
This Python code does the same thing as the Java code. It reads two integers from the standard input, then counts the number of ways to choose three non-negative integers x, y, and z such that x, y, and z are all less than or equal to k and their sum is s. The result is then printed to the standard output.
<|EOT|>
