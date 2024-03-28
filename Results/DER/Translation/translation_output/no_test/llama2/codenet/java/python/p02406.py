<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
   
class p02406{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int count=0;
        int a=1,b;
        if(x>=3 && x<=10000){
            for(; count<x; count++){
                 b = a/10;
                    if(a%3==0){
                        sb.append(" ");
                        sb.append(a);
                    }else{
                        b = a;
                        while(b!=0){
                            if(b%10==3){
                                sb.append(" ");
                                sb.append(a);
                                break;
                            }
                            b /= 10;
                        }
                    }
                    a++;
            }
        }
        System.out.println(sb);
    }
}
```

### 解题思路

```python
import sys

x = int(sys.stdin.readline())

sb = ""
count = 0
a = 1
b = 0

if x >= 3 and x <= 10000:
    for _ in range(x):
        b = a / 10
        if a % 3 == 0:
            sb += " "
            sb += str(a)
        else:
            b = a
            while b != 0:
                if b % 10 == 3:
                    sb += " "
                    sb += str(a)
                    break
                b //= 10
        a += 1

print(sb)
```

### 复杂度分析

- 时间复杂度：O(x)。
- 空间复杂度：O(x)。

### 相关题目

- [p02405](../p02405)
</s>
