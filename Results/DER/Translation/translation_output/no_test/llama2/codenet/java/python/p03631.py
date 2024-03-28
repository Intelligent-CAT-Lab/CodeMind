<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03631 {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// å¥å
    	int a = sc.nextInt();

    	int a100 = a/100;
    	int a10 = a/10 - a100*10;
    	int a1 = a - a100*100 - a10*10;
    	int rev = a1*100 + a10*10 + a100;
    	String ans;

    	if (a == rev){
    		ans = "Yes";
    	} else {
    		ans = "No";
    	}

    	// åºå
    	System.out.println(ans);
    }
}
```

## 解答

```python
import sys

a = int(sys.stdin.readline())

a100 = a//100
a10 = (a-a100*100)//10
a1 = (a-a100*100-a10*10)
rev = a1*100 + a10*10 + a100

if a == rev:
    ans = "Yes"
else:
    ans = "No"

print(ans)
```

## 解析

1. 读取输入
2. 计算a100, a10, a1
3. 计算rev
4. 判断是否相等
5. 输出结果

## 思路

1. 读取输入
2. 计算a100, a10, a1
3. 计算rev
4. 判断是否相等
5. 输出结果

## 代码

```python
import sys

a = int(sys.stdin.readline())

a100 = a//100
a10 = (a-a100*100)//10
a1 = (a-a100*100-a10*10)
rev = a1*100 + a10*10 + a100

if a == rev:
    ans = "Yes"
else:
    ans = "No"

print(ans)
```

## 复杂度分析

- 时间复杂度：O(1)
- 空间复杂度：O(1)

## 相关题目

- [p03630](./p03630.md)
</s>
