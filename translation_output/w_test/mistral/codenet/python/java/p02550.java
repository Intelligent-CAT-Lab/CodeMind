<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 2 1001

Expected output:
1369


```
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
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, m;
        n = sc.nextInt();
        x = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = (int) Math.pow(arr[i], 2) % m;
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
        if (h != -1) {
            int new_arr[] = new int[n - (h + 1)];
            int c = 0;
            int q = (n - (h + 1)) / c;
            int ssum = 0;
            for (int i = 0; i < c; i++) {
                new_arr[i] = arr[h + 1 + i];
                ssum += new_arr[i];
            }
            res += ssum * q;
            for (int i = c; i < n - (h + 1); i++) {
                res += arr[i];
            }
        }
        System.out.println(res);
    }
}
```</s>
