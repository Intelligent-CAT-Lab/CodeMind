<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p03292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = sc.nextInt();
        int Y = sc.nextInt();

        int A = Math.max(Math.max(T,R),Y);
        int B = Math.min(Math.min(T,R),Y);

        System.out.println(A-B);
    }
}


Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    T, R, Y = map(int, input().split())
    A = max(T, R, Y)
    B = min(T, R, Y)
    print(A - B)

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input string into a list of integers, and the `max` and `min` functions are used to find the maximum and minimum values of the list. The `print` function is used to print the result.</s>
