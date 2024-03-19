<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 2

Expected output:
3
7
8

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
[/INST]
```python
import sys

def main():
    a, b, k = map(int, sys.stdin.readline().split())
    set_ = set()
    for i in range(a, b+1):
        set_.add(i)
    for i in range(b, a-1, -1):
        set_.add(i)
    for i in set_:
        print(i)

if __name__ == "__main__":
    main()
```

Explanation:

* The `map()` function is used to convert the input strings to integers.
* The `range()` function is used to iterate over the range of numbers from `a` to `b`.
* The `set()` data structure is used to store the unique numbers.
* The `for` loop is used to iterate over the set and print the numbers.
* The `if __name__ == "__main__":` block is used to execute the `main()` function when the script is run directly.</s>
