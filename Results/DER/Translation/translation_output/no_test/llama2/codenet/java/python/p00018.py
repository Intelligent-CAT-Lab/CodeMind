<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class p00018 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		Integer ans[] = {1,1,1,1,1} ;
		int count = 0;
		while (sc.hasNext()) {
			int num = sc.nextInt();
			ans[count] = num;
			count++;
			if(count==5){
				System.out.println(strkn(ans));
				break;
			}
		}
	}
	public static String strkn(Integer[] ans){
		Arrays.sort(ans, Comparator.reverseOrder()); // ???????????????
		String result = ans[0].toString() +" "+ ans[1].toString() +" "+ ans[2].toString() +" "+ ans[3].toString() +" "+ ans[4].toString();
		return result;
	}
}
```

### 解答

```python
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class p00018:
    def main(self, args):
        sc = Scanner(System.in)
        ans = [1, 1, 1, 1, 1]
        count = 0
        while sc.hasNext():
            num = sc.nextInt()
            ans[count] = num
            count += 1
            if count == 5:
                print(strkn(ans))
                break
    def strkn(self, ans):
        ans.sort(reverse=True)
        result = ans[0] + " " + ans[1] + " " + ans[2] + " " + ans[3] + " " + ans[4]
        return result
```

### 解析

```python
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class p00018:
    def main(self, args):
        sc = Scanner(System.in)
        ans = [1, 1, 1, 1, 1]
        count = 0
        while sc.hasNext():
            num = sc.nextInt()
            ans[count] = num
            count += 1
            if count == 5:
                print(strkn(ans))
                break
    def strkn(self, ans):
        ans.sort(reverse=True)
        result = ans[0] + " " + ans[1] + " " + ans[2] + " " + ans[3] + " " + ans[4]
        return result
```

### 总结

1. 使用 ```import java.io.BufferedReader;``` 导入 ```BufferedReader``` 类
2. 使用 ```import java.io.IOException;``` 导入 ```IOException``` 类
3. 使用 ```import java.io.InputStreamReader;``` 导入 ```InputStreamReader``` 类
4. 使用 ```import java.util.Arrays;``` 导入 ```Arrays``` 类
5. 使用 ```import java.util.Comparator;``` 导入 ```Comparator``` 类
6. 使用 ```import java.util.HashMap;``` 导入 ```HashMap``` 类
7. 使用 ```import java.util.Iterator;``` 导入 ```Iterator``` 类
8. 使用 ```import java.util.Map;``` 导入 ```Map``` 类
9. 使用 ```import java.util.Scanner;``` 导入 ```Scanner``` 类
10. 使用 ```sc = Scanner(System.in)``` 创建 ```sc``` 变量，并将其初始化为 ```System.in``` 的 ```Scanner``` 对象
11. 使用 ```ans = [1, 1, 1, 1, 1]``` 创建 ```ans``` 变量，并将其初始化为 ```[1, 1, 1, 1, 1]``` 的列表
12. 使用 ```count = 0``` 创建 ```count``` 变量，并将其初始化为 ```0```
13. 使用 ```while sc.hasNext():``` 循环，直到 ```sc.hasNext()``` 为 ```True```
14. 使用 ```num = sc.nextInt()``` 创建 ```num``` 变量，并将其初始化为 ```sc.nextInt()``` 的整数
15. 使用 ```ans[count] = num``` 创建 ```ans[count]``` 变量，并将其初始化为 ```num```
16. 使用 ```count += 1``` 创建 ```count``` 变量，并将其初始化为 ```count + 1```
17. 使用 ```if count == 5:``` 判断 ```count``` 是否等于 ```5```
18. 使用 ```break``` 退出循环
19. 使用 ```print(strkn(ans))``` 打印 ```strkn(ans)``` 的结果
20. 使用 ```break``` 退出循环
21. 使用 ```def strkn(self, ans):``` 创建 ```strkn``` 函数
22. 使用 ```ans.sort(reverse=True)``` 创建 ```ans``` 变量，并将其初始化为 ```ans.sort(reverse=True)``` 的列表
23. 使用 ```result = ans[0] + " " + ans[1] + " " + ans[2] + " " + ans[3] + " " + ans[4]``` 创建 ```result``` 变量，并将其初始化为 ```ans[0] + " " + ans[1] + " " + ans[2] + " " + ans[3] + " " + ans[4]```
24. 使用 ```return result``` 返回 ```result```

### 参考

1. [Java 到 Python 的转换](https://www.jianshu.com/p/000000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-100000-
