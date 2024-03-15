<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;


public class p03059 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int amount = 0;
      	int time = a;  
      
        for(int i = 2; time <= c + 0.5; i++){
            amount += b;
          	time = a * i;
        }
        
        System.out.println(amount);
    }
}
```

### 解答

```python
import java.util


def main():
    a = int(input())
    b = int(input())
    c = int(input())
    amount = 0
    time = a

    for i in range(2, c + 0.5):
        amount += b
        time = a * i

    print(amount)


if __name__ == '__main__':
    main()
```

### 解析

1. 将输入转换为整数
2. 循环计算
3. 输出结果

### 思路

1. 将输入转换为整数
2. 循环计算
3. 输出结果

### 代码

1. 将输入转换为整数
2. 循环计算
3. 输出结果

### 总结

1. 将输入转换为整数
2. 循环计算
3. 输出结果

### 参考

1. 将输入转换为整数
2. 循环计算
3. 输出结果
</s>
