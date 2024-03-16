<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p03352 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = {1, 4, 8, 16, 32, 64, 128, 256, 512,  9, 27, 81, 243, 729,  16, 64, 256, 1024, 25, 125, 625,  36, 216,  49, 343,  64, 512,  81, 729,  100, 1000, 121,  144,  169,  196,  225,  256,  289,  324,  361,  400, 441, 484,  529,  576,  625,  676,  729,  784,  841, 900,  961};
        Arrays.sort(num);
        int X = sc.nextInt();
        int max = -1;
        for(int i = num.length; i > 0; i--){
            int n = num[i - 1];
            if(n <= X){
                max = Math.max(max, n);
                break;
            }
        }
        System.out.println(max);
    }
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

num = [1, 4, 8, 16, 32, 64, 128, 256, 512, 9, 27, 81, 243, 729, 16, 64, 256, 1024, 25, 125, 625, 36, 216, 49, 343, 64, 512, 81, 729, 100, 1000, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961]
num.sort()
X = int(sys.stdin.readline())
max = -1
for i in range(len(num) - 1, -1, -1):
    n = num[i]
    if n <= X:
        max = max(max, n)
        break
print(max)
```

This Python code does the same thing as the Java code. It reads a number from the standard input, sorts the list of numbers, and then finds the largest number that is less than or equal to the input number.<｜end▁of▁sentence｜>
