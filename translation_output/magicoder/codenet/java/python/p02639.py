<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    x = [0]*5
    sum = 0
    for i in range(5):
        x[i] = int(sys.stdin.readline())
        sum += x[i]
    print(15-sum)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads 5 integers from the standard input, calculates their sum, and then prints the difference between 15 and the sum.<｜end▁of▁sentence｜>
