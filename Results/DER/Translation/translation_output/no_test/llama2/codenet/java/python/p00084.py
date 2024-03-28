<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00084 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				String str = sc.nextLine();
				str = str.replace('.', ',');
				str = str.replace(',', ' ');
				String[] tokens = str.split(" ");
				int count = 0;
				
				for(int i=0; i<tokens.length; i++) {
					int n = tokens[i].length();
					
					if(n>=3 && n<=6) {
						if(count > 0) System.out.print(" ");
						System.out.print(tokens[i].substring(0,n));
						count++;
					}
				}
				if(count > 0) System.out.println();
			}
		}
	}
}

```

### 解答

```python
import sys

def main():
    while True:
        line = sys.stdin.readline()
        line = line.replace('.', ',')
        line = line.replace(',', ' ')
        tokens = line.split(' ')
        count = 0
        for i in range(len(tokens)):
            n = len(tokens[i])
            if 3 <= n <= 6:
                if count > 0:
                    print(' ', end='')
                print(tokens[i][:n])
                count += 1
        if count > 0:
            print()

if __name__ == '__main__':
    main()
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入，然后使用 `replace` 方法替换 `.` 和 `,` 字符。
2. 使用 `split` 方法将字符串分割成单词，然后使用 `for` 循环遍历单词，判断单词的长度是否在 3 到 6 之间，如果是，则使用 `print` 方法打印单词，并使用 `if` 语句判断是否有多个单词，如果有，则使用 `print` 打印一个空格。
3. 最后使用 `if` 语句判断是否有多个单词，如果有，则使用 `print` 打印一个空格。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

1. [翻译](../p00083.md)
2. [翻译](../p00085.md)
</s>
