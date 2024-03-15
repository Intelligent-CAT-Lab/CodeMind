<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02742 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();

		if(w == 1 || h == 1) {
			System.out.println(1);
			return;
		}
		long c = (w*h)%2 == 0 ? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}
```

### 解题思路

1. 首先我们需要把输入的数据转换成python的数据类型，这里我们使用了`Scanner`类来实现。
2. 然后我们需要判断输入的数据是否为1，如果是，则直接输出1即可。
3. 如果不是，我们需要计算出一个数，这个数是一个长方形的面积，如果这个数是偶数，则输出这个数，如果是奇数，则输出这个数加1。

### 代码实现

```python
import sys

def main():
    w = int(sys.stdin.readline())
    h = int(sys.stdin.readline())
    if w == 1 or h == 1:
        print(1)
        return
    c = (w*h)%2 == 0 and (w*h)/2 or (w*h)/2+1
    print(c)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

1. [矩形面积](https://leetcode-cn.com/problems/rectangle-area/)
2. [矩形面积II](https://leetcode-cn.com/problems/rectangle-area-ii/)
3. [矩形面积III](https://leetcode-cn.com/problems/rectangle-area-iii/)
4. [矩形面积IV](https://leetcode-cn.com/problems/rectangle-area-iv/)
5. [矩形面积V](https://leetcode-cn.com/problems/rectangle-area-v/)
6. [矩形面积VI](https://leetcode-cn.com/problems/rectangle-area-vi/)
7. [矩形面积VII](https://leetcode-cn.com/problems/rectangle-area-vii/)
8. [矩形面积VIII](https://leetcode-cn.com/problems/rectangle-area-viii/)
9. [矩形面积IX](https://leetcode-cn.com/problems/rectangle-area-ix/)
10. [矩形面积X](https://leetcode-cn.com/problems/rectangle-area-x/)
11. [矩形面积XI](https://leetcode-cn.com/problems/rectangle-area-xi/)
12. [矩形面积XII](https://leetcode-cn.com/problems/rectangle-area-xii/)
13. [矩形面积XIII](https://leetcode-cn.com/problems/rectangle-area-xiii/)
14. [矩形面积XIV](https://leetcode-cn.com/problems/rectangle-area-xiv/)
15. [矩形面积XV](https://leetcode-cn.com/problems/rectangle-area-xv/)
16. [矩形面积XVI](https://leetcode-cn.com/problems/rectangle-area-xvi/)
17. [矩形面积XVII](https://leetcode-cn.com/problems/rectangle-area-xvii/)
18. [矩形面积XVIII](https://leetcode-cn.com/problems/rectangle-area-xviii/)
19. [矩形面积XIX](https://leetcode-cn.com/problems/rectangle-area-xix/)
20. [矩形面积XX](https://leetcode-cn.com/problems/rectangle-area-xx/)
21. [矩形面积XXI](https://leetcode-cn.com/problems/rectangle-area-xxi/)
22. [矩形面积XXII](https://leetcode-cn.com/problems/rectangle-area-xxii/)
23. [矩形面积XXIII](https://leetcode-cn.com/problems/rectangle-area-xxiii/)
24. [矩形面积XXIV](https://leetcode-cn.com/problems/rectangle-area-xxiv/)
25. [矩形面积XXV](https://leetcode-cn.com/problems/rectangle-area-xxv/)
26. [矩形面积XXVI](https://leetcode-cn.com/problems/rectangle-area-xxvi/)
27. [矩形面积XXVII](https://leetcode-cn.com/problems/rectangle-area-xxvii/)
28. [矩形面积XXVIII](https://leetcode-cn.com/problems/rectangle-area-xxviii/)
29. [矩形面积XXIX](https://leetcode-cn.com/problems/rectangle-area-xxix/)
30. [矩形面积XXX](https://leetcode-cn.com/problems/rectangle-area-xxx/)
31. [矩形面积XXXI](https://leetcode-cn.com/problems/rectangle-area-xxxI/)
32. [矩形面积XXXII](https://leetcode-cn.com/problems/rectangle-area-xxxII/)
33. [矩形面积XXXIII](https://leetcode-cn.com/problems/rectangle-area-xxxIII/)
34. [矩形面积XXXIV](https://leetcode-cn.com/problems/rectangle-area-xxxIV/)
35. [矩形面积XXXV](https://leetcode-cn.com/problems/rectangle-area-xxxV/)
36. [矩形面积XXXVI](https://leetcode-cn.com/problems/rectangle-area-xxxVI/)
37. [矩形面积XXXVII](https://leetcode-cn.com/problems/rectangle-area-xxxVII/)
38. [矩形面积XXXVIII](https://leetcode-cn.com/problems/rectangle-area-xxxVIII/)
39. [矩形面积XXXIX](https://leetcode-cn.com/problems/rectangle-area-xxxIX/)
40. [矩形面积XL](https://leetcode-cn.com/problems/rectangle-area-xl/)
41. [矩形面积XLI](https://leetcode-cn.com/problems/rectangle-area-xli/)
42. [矩形面积XLII](https://leetcode-cn.com/problems/rectangle-area
