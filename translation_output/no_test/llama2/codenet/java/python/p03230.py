<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p03230 {
	static int v = 0;
	static List<List<Integer>> ansList = null;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		if (n == 1) {
			System.out.println("Yes");
			System.out.println(2);
			System.out.println("1 1");
			System.out.println("1 1");
			return;
		}
		if (n == 2) {
			System.out.println("No");
			return;
		}

		int k = 0;
		for (int i = 3; i <= n; i++) {
			int ic2 = i * (i - 1) / 2;
			if (ic2 == n) {
				k = i;
				break;
			} else if (ic2 > n) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

		ansList = new ArrayList<List<Integer>>(k);
		int[] target = new int[k];
		for (int i = 0; i < k; i++) {
			ansList.add(new ArrayList<Integer>(k - 1));
			target[i] = i;
		}
		combination(target, 2, new ArrayList<Integer>());

		System.out.println(k);
		for (int i = 0; i < k; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(k - 1).append(' ');
			List<Integer> list = ansList.get(i);
			for (int j : list) {
				sb.append(j).append(' ');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}

	static void combination(int[] target, int k, List<Integer> list) {
		if (list.size() == k) {
			v++;
			for (int i : list) {
				ansList.get(i).add(v);
			}
			return;
		}

		int i = 0;
		if (!list.isEmpty()) {
			i = list.get(list.size() - 1) + 1;
			if (list.size() + target.length - i < k) {
				return;
			}
		}
		for ( ; i < target.length; i++) {
			list.add(i);
			combination(target, k, list);
			list.remove(list.size() - 1);
		}
	}
}

```

### 解析

```python
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class p03230:
    static int v = 0
    static List<List<Integer>> ansList = None

    def main(self, args):
        br = BufferedReader(InputStreamReader(System.in))
        n = int(br.readline())
        br.close()

        if n == 1:
            print("Yes")
            print(2)
            print("1 1")
            print("1 1")
            return
        if n == 2:
            print("No")
            return

        k = 0
        for i in range(3, n + 1):
            ic2 = i * (i - 1) // 2
            if ic2 == n:
                k = i
                break
            elif ic2 > n:
                print("No")
                return

        print("Yes")

        ansList = [[] for _ in range(k)]
        target = [i for i in range(k)]
        for i in range(k):
            ansList[i] = [i]
        combination(target, 2, [])

        print(k)
        for i in range(k):
            sb = StringBuilder()
            sb.append(k - 1)
            list = ansList[i]
            for j in list:
                sb.append(j)
            sb.deleteCharAt(sb.length() - 1)
            print(sb.toString())

    def combination(self, target, k, list):
        if len(list) == k:
            v += 1
            for i in list:
                ansList[i].append(v)
            return

        i = 0
        if not list:
            i = 0
        elif list[-1] + 1 < k:
            return
        for i in range(target[i], target.length):
            list.append(i)
            combination(target, k, list)
            list.pop()

```

### 复杂度分析

- 时间复杂度：O(n^2)。
- 空间复杂度：O(n)。

### 相关题目

- [p03231](https://leetcode-cn.com/problems/p03231/)
</s>
