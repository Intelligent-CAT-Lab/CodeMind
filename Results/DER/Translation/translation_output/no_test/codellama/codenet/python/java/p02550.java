<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n, x, m = map(int, input().split())

arr = [x]
s = set()
s.add(x)
h = -1
r = 0
for i in range(n - 1):
	val = arr[-1]**2 % m
	if val not in s:
		arr += [arr[-1]**2 % m]
		s.add(arr[-1])
	else:
		h = i
		r = val
		break


res = sum(arr)
if h != -1:
	new_arr = arr[arr.index(r):]
	rest = n - (h + 1)
	c = len(new_arr)
	q = rest // c
	ssum = sum(new_arr) * q
	r = rest % c
	for i in range(r):
		ssum += new_arr[i]
	res += ssum	
	
print(res)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = arr[i] * arr[i] % m;
            if (!s.contains(val)) {
                arr[i + 1] = val;
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += arr[i];
        }

        if (h != -1) {
            int[] newArr = new int[n - h - 1];
            System.arraycopy(arr, h + 1, newArr, 0, newArr.length);
            int rest = n - (h + 1);
            int c = newArr.length;
            int q = rest / c;
            int ssum = 0;
            for (int i = 0; i < c; i++) {
                ssum += newArr[i] * q;
            }
            for (int i = 0; i < rest % c; i++) {
                ssum += newArr[i];
            }
            res += ssum;
        }

        System.out.println(res);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Set` and `HashSet` classes to keep track of the values that have already been seen. The `System.arraycopy` method is used to copy the elements of the `arr` array to a new array `newArr` starting from the index `h + 1`. The `System.out.println` method is used to print the result.</s>
