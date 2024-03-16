<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:



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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b, k = map(int, sys.stdin.readline().split())

set = set()
cnt = 0
for i in range(a, b+1):
    if cnt >= k:
        break
    cnt += 1
    set.add(i)

cnt = 0
for i in range(b, a-1, -1):
    if cnt >= k:
        break
    cnt += 1
    set.add(i)

for ans in set:
    print(ans)
```
This is the Python code that translates the Java code you provided. It uses the `map` function to convert the input from a string to a list of integers, and then uses a `set` to store the unique values. The `range` function is used to iterate over the range of values from `a` to `b`, and the `for` loop is used to add the values to the set. The `cnt` variable is used to keep track of the number of values added to the set, and the `break` statement is used to exit the loop when the desired number of values has been reached. Finally, the `for` loop is used to print the values in the set.</s>
