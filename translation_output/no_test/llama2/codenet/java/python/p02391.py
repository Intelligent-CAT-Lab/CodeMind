<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02391 {

	public static void main(String[] args) {
		
		String CMD = null ;
		BufferedReader BR = null;
		BR = new BufferedReader(new InputStreamReader(System.in));
		try {CMD = BR.readLine();
		} 
		catch (IOException e) {e.printStackTrace();
		}
		String[] str = CMD.split(" "); 
		
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		
		if(x==y){
			System.out.println("a == b");
		}if(x<y){
			System.out.println("a < b");
		}if(x>y){
			System.out.println("a > b");
		}

	}

}
```

### 解答

```python
import sys

cmd = sys.stdin.readline()
x, y = map(int, cmd.split())

if x == y:
    print("a == b")
elif x < y:
    print("a < b")
elif x > y:
    print("a > b")
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `map(int, cmd.split())` 将输入转换为 `x, y`
3. 使用 `if` 语句判断 `x == y`
4. 使用 `elif` 语句判断 `x < y`
5. 使用 `elif` 语句判断 `x > y`

### 总结

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `map(int, cmd.split())` 将输入转换为 `x, y`
3. 使用 `if` 语句判断 `x == y`
4. 使用 `elif` 语句判断 `x < y`
5. 使用 `elif` 语句判断 `x > y`

### 参考

1. [Python 3.8.2 Documentation](https://docs.python.org/3/library/stdtypes.html#file.readline)
2. [Python 3.8.2 Documentation](https://docs.python.org/3/library/functions.html#map)
3. [Python 3.8.2 Documentation](https://docs.python.org/3/reference/compound_stmts.html#the-if-statement)
4. [Python 3.8.2 Documentation](https://docs.python.org/3/reference/compound_stmts.html#the-elif-statement)
</s>
