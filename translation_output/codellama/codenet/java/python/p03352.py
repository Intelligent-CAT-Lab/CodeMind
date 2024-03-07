<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    num = [1, 4, 8, 16, 32, 64, 128, 256, 512, 9, 27, 81, 243, 729, 16, 64, 256, 1024, 25, 125, 625, 36, 216, 49, 343, 64, 512, 81, 729, 100, 1000, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961]
    num.sort()
    X = int(input("Enter a number: "))
    max = -1
    for i in range(len(num), 0, -1):
        n = num[i - 1]
        if n <= X:
            max = max(max, n)
            break
    print(max)

if __name__ == "__main__":
    main()
```
This is the Python code that translates the Java code you provided. The main difference is that Python uses the `input()` function to get user input, while Java uses the `Scanner` class. Additionally, Python uses the `math.max()` function to find the maximum value of two numbers, while Java uses the `Math.max()` method.</s>
