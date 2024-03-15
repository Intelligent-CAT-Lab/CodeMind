<s> Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p03386 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int k = scanner.nextInt();
		Set<Integer> set = new TreeSet<>();
		int cnt = 0;
		for (int i = a; i <= b; i++) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
		}
		cnt = 0;
		for (int i = b; i >= a; i--) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
		}
		
		for (Integer ans : set) {
			System.out.println(ans);
		}
		scanner.close();

	}

}

```

### 解析

1. 使用 ```TreeSet``` 来保存数据，并且使用 ```for``` 循环来循环输出数据。
2. 使用 ```if``` 语句来判断 ```cnt``` 是否大于 ```k``` ，如果大于 ```k``` 则直接跳出循环。
3. 使用 ```for``` 循环来循环输出数据。

### 代码

```python
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p03386 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int k = scanner.nextInt();
		Set<Integer> set = new TreeSet<>();
		int cnt = 0;
		for (int i = a; i <= b; i++) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
		}
		cnt = 0;
		for (int i = b; i >= a; i--) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
		}
		
		for (Integer ans : set) {
			print(ans);
		}
		scanner.close();

	}

	public static void print(int ans) {
		System.out.println(ans);
	}

}

```

### 复杂度分析

- 时间复杂度：$$O(n)$$。
- 空间复杂度：$$O(n)$$。

### 相关题目

- [p03385](./p03385.md)
</s>
