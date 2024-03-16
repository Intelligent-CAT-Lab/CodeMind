<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00050{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  String str=sc.nextLine();
			  String ans=str.replace("apple", "wwwp");
			  ans=ans.replace("peach", "wwwa");
			  ans=ans.replace("wwwp", "peach");
			  ans=ans.replace("wwwa", "apple");
			  System.out.println(ans);
		  }
	}
}

```

### 解答

```python
import sys

def main():
    str = sys.stdin.readline()
    ans = str.replace("apple", "wwwp")
    ans = ans.replace("peach", "wwwa")
    ans = ans.replace("wwwp", "peach")
    ans = ans.replace("wwwa", "apple")
    print(ans)

if __name__ == "__main__":
    main()
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `replace` 方法替换字符串
3. 使用 `print` 打印结果

### 执行结果

```
apple
```

### 参考

[https://www.jianshu.com/p/0005000000000000](https://www.jianshu.com/p/0005000000000000)
</s>
