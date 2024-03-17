<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15

Expected output:
6


```
import java.util.*;

public class p03331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n;
        for(int a = 2; a <= n/2; a++) {
            int b = n - a;
            int sum = digit(a) + digit(b);
            ans = Math.min(sum,ans);
        }
        System.out.println(ans);
    }
    
    static int digit(int num) {
        int r = 0;
        while(true) {
            r += (num%10);
            num /= 10;
            if(num == 0) break;
        }
        return r;
    }
}
```
[/INST]
```python
import math

def digit(num):
    r = 0
    while num > 0:
        r += num % 10
        num //= 10
    return r

def main():
    n = int(input())
    ans = n
    for a in range(2, n//2+1):
        b = n - a
        sum = digit(a) + digit(b)
        ans = min(sum, ans)
    print(ans)

if __name__ == "__main__":
    main()
```
This is the Python code for the given Java code. The `digit` function is implemented using a while loop to iterate over the digits of the input number and calculate the sum of its digits. The `main` function takes the input from the user, calculates the minimum sum of the digits of the two numbers that add up to the input number, and prints the result.</s>
