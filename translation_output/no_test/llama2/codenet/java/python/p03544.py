<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03544{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] num = new long[100];

        for(int i =0;i<100;i++){
            if(i==0){
                num[i]=2;
            }else if(i==1){
                num[i]=1;
            }else{
            num[i] = num[i-1]+num[i-2];
        }
    }

        System.out.println(num[n]);
        

    }
}


```

### 解题思路

```python
import java.util

class p03544:
    def main(self, args):
        n = int(input())
        num = [2] * 100
        for i in range(1, 100):
            num[i] = num[i - 1] + num[i - 2]
        print(num[n])


if __name__ == '__main__':
    p03544().main(None)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p03543](https://leetcode-cn.com/problems/p03543/)
</s>
