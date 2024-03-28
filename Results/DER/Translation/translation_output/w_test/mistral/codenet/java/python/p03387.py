<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
```python
import sys
x = list(map(int, input().split()))
x.sort()
temp = 2*x[-1] - x[1] - x[0]
ans = 0
if temp % 2 == 1:
    ans = (temp + 2) // 2 + 1
else:
    ans = temp // 2
print(ans)
```</s>
