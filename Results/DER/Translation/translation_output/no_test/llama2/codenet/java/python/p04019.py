<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		boolean checkS = false;
		boolean checkN = false;
		boolean checkW = false;
		boolean checkE = false;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'S'){
				checkS = true;
			}else if(s.charAt(i) == 'N'){
				checkN = true;
			}else if(s.charAt(i) == 'W'){
				checkW = true;
			}else if(s.charAt(i) == 'E'){
				checkE = true;
			}
		}
		if(checkS == checkN && checkW == checkE){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}

```

### 解答

```python
import sys

def main():
    s = sys.stdin.readline()
    checkS = False
    checkN = False
    checkW = False
    checkE = False
    for i in range(len(s)):
        if s[i] == 'S':
            checkS = True
        elif s[i] == 'N':
            checkN = True
        elif s[i] == 'W':
            checkW = True
        elif s[i] == 'E':
            checkE = True
    if checkS == checkN and checkW == checkE:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

### 解析

1. 将输入转换为字符串
2. 遍历字符串，判断字符是否为S、N、W、E
3. 判断S、N、W、E是否都出现了
4. 如果都出现了，则输出“Yes”，否则输出“No”

### 思路

1. 将输入转换为字符串
2. 遍历字符串，判断字符是否为S、N、W、E
3. 判断S、N、W、E是否都出现了
4. 如果都出现了，则输出“Yes”，否则输出“No”

### 代码

1. 将输入转换为字符串
2. 遍历字符串，判断字符是否为S、N、W、E
3. 判断S、N、W、E是否都出现了
4. 如果都出现了，则输出“Yes”，否则输出“No”

### 总结

1. 将输入转换为字符串
2. 遍历字符串，判断字符是否为S、N、W、E
3. 判断S、N、W、E是否都出现了
4. 如果都出现了，则输出“Yes”，否则输出“No”

### 参考

1. [https://www.jiuzhang.com/problem/p04019/](https://www.jiuzhang.com/problem/p04019/)
2. [https://leetcode-cn.com/problems/p04019/](https://leetcode-cn.com/problems/p04019/)
3. [https://leetcode-cn.com/problems/p04019/solution/](https://leetcode-cn.com/problems/p04019/solution/)
</s>
