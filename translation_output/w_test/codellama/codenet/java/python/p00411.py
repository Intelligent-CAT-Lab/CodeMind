<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
180 120 90

Expected output:
60.0


```
import java.util.*;

public class p00411{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double t = scan.nextInt();
        double r = scan.nextInt();
        System.out.println(r * t / a);
        scan.close();
    }
}

```
[/INST]
```
import math

def main():
    a, t, r = map(float, input().split())
    print(r * t / a)

if __name__ == '__main__':
    main()
```
This code uses the `math` module to perform the division operation, and it also uses the `map` function to convert the input strings to floating-point numbers. The `input` function is used to read the input from the user, and the `split` method is used to split the input string into three parts. The `float` function is used to convert the input strings to floating-point numbers. Finally, the `print` function is used to print the result.</s>
