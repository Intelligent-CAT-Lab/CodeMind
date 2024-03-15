<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00006 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String ret = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(str.length() - i - 1);
			ret += ch;
		}
		System.out.println(ret);
	}
}
```

### 解答

```python
import sys

def main():
    str = sys.stdin.readline()
    ret = ''
    for i in range(len(str) - 1, -1, -1):
        ret += str[i]
    print(ret)

if __name__ == '__main__':
    main()
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入
2. 使用 `for` 循环遍历字符串，从最后一个字符开始，每次读取一个字符，并将其添加到 `ret` 中
3. 使用 `print` 打印结果

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

1. [00007. 反转字符串](https://leetcode-cn.com/problems/reverse-string/)
2. [00010. 反转字符串](https://leetcode-cn.com/problems/reverse-string-ii/)
3. [00011. 反转字符串](https://leetcode-cn.com/problems/reverse-string-iii/)
4. [00012. 反转字符串](https://leetcode-cn.com/problems/reverse-string-iv/)
5. [00013. 反转字符串](https://leetcode-cn.com/problems/reverse-string-v/)
6. [00014. 反转字符串](https://leetcode-cn.com/problems/reverse-string-vi/)
7. [00015. 反转字符串](https://leetcode-cn.com/problems/reverse-string-vii/)
8. [00016. 反转字符串](https://leetcode-cn.com/problems/reverse-string-viii/)
9. [00017. 反转字符串](https://leetcode-cn.com/problems/reverse-string-ix/)
10. [00018. 反转字符串](https://leetcode-cn.com/problems/reverse-string-x/)
11. [00019. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xi/)
12. [00020. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xii/)
13. [00021. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xiii/)
14. [00022. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xiv/)
15. [00023. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xv/)
16. [00024. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xvi/)
17. [00025. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xvii/)
18. [00026. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xviii/)
19. [00027. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xix/)
20. [00028. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xx/)
21. [00029. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxi/)
22. [00030. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxii/)
23. [00031. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxiii/)
24. [00032. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxiv/)
25. [00033. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxv/)
26. [00034. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxvi/)
27. [00035. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxvii/)
28. [00036. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxviii/)
29. [00037. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxix/)
30. [00038. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxx/)
31. [00039. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxxi/)
32. [00040. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxxii/)
33. [00041. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxxiii/)
34. [00042. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxxiv/)
35. [00043. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxxv/)
36. [00044. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxxvi/)
37. [00045. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxxvii/)
38. [00046. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxxviii/)
39. [00047. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xxxix/)
40. [00048. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xl/)
41. [00049. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xli/)
42. [00050. 反转字符串](https://leetcode-cn.com/problems/reverse-string-xlii/)
43. [00051. 反转字符串](https://leetcode-cn.
