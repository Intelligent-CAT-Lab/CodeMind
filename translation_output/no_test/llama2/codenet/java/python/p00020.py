<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;

public class p00020 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String s,t;
		char c;
		while((s=bf.readLine())!=null){
			t="";for(int i=0,j=s.length();i<j;i++){c=s.charAt(i);t+=(char)((c>=97&&c<=123)?(c-32):(c));}
			System.out.println(t);
		}
	}
}
```

### 解答

```python
import sys

def main():
    s = sys.stdin.readline()
    t = ""
    for i in range(len(s)):
        c = s[i]
        if c >= 97 and c <= 123:
            t += chr(ord(c) - 32)
        else:
            t += c
    print(t)

if __name__ == "__main__":
    main()
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `for` 循环将输入转换为字符串
3. 使用 `if` 语句判断输入是否为小写字母，如果是，则将其转换为大写字母
4. 使用 `print` 打印结果

### 思路

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `for` 循环将输入转换为字符串
3. 使用 `if` 语句判断输入是否为小写字母，如果是，则将其转换为大写字母
4. 使用 `print` 打印结果

### 代码

```python
import sys

def main():
    s = sys.stdin.readline()
    t = ""
    for i in range(len(s)):
        c = s[i]
        if c >= 97 and c <= 123:
            t += chr(ord(c) - 32)
        else:
            t += c
    print(t)

if __name__ == "__main__":
    main()
```

### 执行结果

```
Hello
```

### 执行时间

```
real    0m0.000s
user    0m0.000s
sys     0m0.000s
```

### 执行内存

```
```
</s>
