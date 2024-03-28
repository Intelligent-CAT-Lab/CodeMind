<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
25

```
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class p03387 {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int[] x=new int[3];
x[0]=sc.nextInt();
x[1]=sc.nextInt();
x[2]=sc.nextInt();
Arrays.sort(x);
int temp=2*x[2]-x[1]-x[0];
int ans;
if(temp%2==1){ans=(temp+2)/2+1;}else{ans=temp/2;}
out.println(ans);
}}
```
[/INST]
```python
import math

def main():
    x = list(map(int, input().split()))
    x.sort()
    temp = 2 * x[2] - x[1] - x[0]
    if temp % 2 == 1:
        ans = (temp + 2) // 2 + 1
    else:
        ans = temp // 2
    print(ans)

if __name__ == "__main__":
    main()
```
Note that the `input()` function in Python is used to read a line of input from the user, and the `split()` method is used to split the input into a list of strings. The `map()` function is used to convert the list of strings to a list of integers. The `sort()` method is used to sort the list in ascending order. The `print()` function is used to print the result.

Also, note that the `//` operator is used for integer division in Python, which is different from the `/` operator which returns a floating-point number.</s>
