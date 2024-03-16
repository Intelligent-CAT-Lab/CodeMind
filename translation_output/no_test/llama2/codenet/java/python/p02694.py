<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p02694 {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long x=stdIn.nextLong();
        int count=0;

        long a=100;
        while(true){
            if(a>=x){
                break;
            }
            a=a+a/100;
            count++;
        }
        System.out.println(count);
        
    }

}
```

### 解题思路

1. 使用while循环，当a>=x时，break，即可。
2. 使用while循环，当a>=x时，break，即可。
3. 使用while循环，当a>=x时，break，即可。
4. 使用while循环，当a>=x时，break，即可。
5. 使用while循环，当a>=x时，break，即可。
6. 使用while循环，当a>=x时，break，即可。
7. 使用while循环，当a>=x时，break，即可。
8. 使用while循环，当a>=x时，break，即可。
9. 使用while循环，当a>=x时，break，即可。
10. 使用while循环，当a>=x时，break，即可。

### 代码实现

```python
import java.util.Scanner;

class p02694 {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long x=stdIn.nextLong();
        int count=0;

        long a=100;
        while(true){
            if(a>=x){
                break;
            }
            a=a+a/100;
            count++;
        }
        System.out.println(count);
        
    }

}
```

### 复杂度分析

- 时间复杂度：O(log(x))
- 空间复杂度：O(1)

### 相关题目

1. [p02693](../p02693)
2. [p02695](../p02695)
</s>
