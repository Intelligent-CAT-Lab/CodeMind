<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 7

Expected output:
-17

```
import java.util.*;


public class p03059 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int amount = 0;
      	int time = a;  
      
        for(int i = 2; time <= c + 0.5; i++){
            amount += b;
          	time = a * i;
        }
        
        System.out.println(amount);
    }
}
```
[/INST]
```
import math

def main():
    a, b, c = map(int, input().split())
    amount = 0
    time = a
    for i in range(2, math.ceil(c + 0.5)):
        amount += b
        time = a * i
    print(amount)

if __name__ == "__main__":
    main()
```
This is the Python code that translates the Java code you provided. The main difference is that Python uses `input()` to read from the standard input, and `print()` to print to the standard output. The rest of the code is similar, with the exception of the `math.ceil()` function, which is used to round up the value of `c + 0.5` to the nearest integer.</s>
