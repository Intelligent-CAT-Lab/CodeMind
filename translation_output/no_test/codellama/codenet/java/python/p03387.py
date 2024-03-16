<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math
import sys

x = list(map(int, sys.stdin.readline().split()))
x.sort()
temp = 2 * x[2] - x[1] - x[0]
ans = temp // 2 if temp % 2 == 0 else (temp + 2) // 2 + 1
print(ans)
```
Note: The `map` function is used to convert the input string to a list of integers, and the `sort` function is used to sort the list in ascending order. The `//` operator is used for integer division, and the `if` statement is used to determine whether the result is even or odd.</s>
