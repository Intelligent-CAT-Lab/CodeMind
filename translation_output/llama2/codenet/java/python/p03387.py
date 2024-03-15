<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解题思路

```python
import java.util
import static java.lang.System
import static java.lang.Math

def main():
    x = [int(input()) for _ in range(3)]
    temp = 2 * x[2] - x[1] - x[0]
    ans = 0
    if temp % 2 == 1:
        ans = (temp + 2) / 2 + 1
    else:
        ans = temp / 2
    print(ans)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03386](https://leetcode-cn.com/problems/p03386/)
</s>
