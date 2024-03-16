<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02393 {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String strNum = br.readLine();
		String[] strNumList = strNum.split(" ");
		
		Arrays.sort(strNumList);
		
		int intNumSmall = Integer.parseInt(strNumList[0]);
		int intNumMiddle = Integer.parseInt(strNumList[1]);
		int intNumlarge = Integer.parseInt(strNumList[2]);
		
		System.out.println(intNumSmall + " " + intNumMiddle + " " + intNumlarge);
	}
}

```

### 解答

```python
import sys

strNum = sys.stdin.readline()
strNumList = strNum.split()

intNumSmall = int(strNumList[0])
intNumMiddle = int(strNumList[1])
intNumlarge = int(strNumList[2])

print(intNumSmall, intNumMiddle, intNumlarge)
```

### 解析

1. 读取输入流
2. 将输入流转换为字符串
3. 将字符串分割成数组
4. 将数组中的数字转换为整数
5. 打印结果

### 总结

1. 使用 `sys.stdin.readline()` 读取输入流
2. 使用 `split()` 将输入流转换为字符串
3. 使用 `int()` 将字符串中的数字转换为整数
4. 使用 `print()` 打印结果

### 参考

1. [Python 3.8.2 官方文档](https://docs.python.org/3/library/stdtypes.html#file.readline)
2. [Python 3.8.2 官方文档](https://docs.python.org/3/library/stdtypes.html#str.split)
3. [Python 3.8.2 官方文档](https://docs.python.org/3/library/functions.html#int)
4. [Python 3.8.2 官方文档](https://docs.python.org/3/library/functions.html#print)
</s>
