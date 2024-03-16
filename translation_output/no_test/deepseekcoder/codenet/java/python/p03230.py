<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys
from itertools import combinations

def main():
    n = int(sys.stdin.readline())

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

    ans_list = [[] for _ in range(k)]
    target = list(range(k))
    combination(target, 2, [], ans_list)

    print(k)
    for i in range(k):
        print(f"{len(ans_list[i]) - 1} {' '.join(map(str, ans_list[i]))}")

def combination(target, k, list, ans_list):
    if len(list) == k:
        for i in list:
            ans_list[i].append(len(ans_list[i]) + 1)
        return

    i = 0
    if list:
        i = list[-1] + 1
        if len(list) + len(target) - i < k:
            return

    for j in range(i, len(target)):
        list.append(j)
        combination(target, k, list, ans_list)
        list.pop()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it's a valid number of vertices for a complete graph, and if so, prints the adjacency list of the graph. If the number is not valid, it prints "No". The combination function is used to generate all possible combinations of vertices for the graph.
<|EOT|>
