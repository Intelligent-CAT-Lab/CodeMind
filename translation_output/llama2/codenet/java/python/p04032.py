<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.util.Scanner;

public class p04032 {
	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);
		String line;
		for (; cin.hasNext();) {
			line = cin.nextLine();

			String[] strArray = line.split("");
			int resultNum1 = -1;
			int resultNum2 = -1;

			for(int i =0; i < strArray.length; i++){

				if(i + 1 <= strArray.length - 1 && strArray[i].equals(strArray[i + 1])){
					resultNum1 = i + 1;
					resultNum2 = i + 2;
					break;
				}


				if(i + 2 <= strArray.length - 1 && strArray[i].equals(strArray[i + 2])){
					resultNum1 = i + 1;
					resultNum2 = i + 3;
					break;
				}
			}


			System.out.println(resultNum1 + " " + resultNum2);
		}
	}
}
```

### 解答

```python
import java.io.IOException;
import java.util.Scanner;

class p04032:
    def main(self, args):
        cin = Scanner(System.in)
        line = cin.nextLine()
        strArray = line.split("")
        resultNum1 = -1
        resultNum2 = -1
        for i in range(len(strArray)):
            if i + 1 <= len(strArray) - 1 and strArray[i] == strArray[i + 1]:
                resultNum1 = i + 1
                resultNum2 = i + 2
                break
            if i + 2 <= len(strArray) - 1 and strArray[i] == strArray[i + 2]:
                resultNum1 = i + 1
                resultNum2 = i + 3
                break
        print(resultNum1, resultNum2)
```

### 解析

1. 将输入的字符串转换为字符数组
2. 遍历字符数组，如果当前字符和下一个字符相同，则将当前字符的索引加1，下一个字符的索引加2，并且跳出循环
3. 如果当前字符和下两个字符相同，则将当前字符的索引加1，下两个字符的索引加3，并且跳出循环
4. 如果没有找到相同的字符，则继续遍历
5. 输出结果

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p04031](./p04031.md)
</s>
