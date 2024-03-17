<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
2


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
```
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
This is the Python code that translates the given Java code. The code uses the `math` module to perform mathematical operations. The `list` function is used to convert the input string into a list of integers, and the `map` function is used to apply the `int` function to each element of the list. The `sort` function is used to sort the list in ascending order. The `temp` variable is calculated using the formula given in the Java code. The `if` statement is used to determine whether the value of `temp` is odd or even, and the `ans` variable is assigned the appropriate value based on the result of the `if` statement. Finally, the `print` function is used to output the value of `ans`.</s>
