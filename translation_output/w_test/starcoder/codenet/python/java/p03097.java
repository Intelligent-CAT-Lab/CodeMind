<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 3

Expected output:
YES
1 0 2 3


```
import sys
sys.setrecursionlimit(10**6)

n, a, b = map(int, input().split())
def pop_count(x):
	res = 0
	for i in range(17):
		res += ((x>>i)%2 == 1)
	return res
if (pop_count(a^b)) % 2 == 0:
	print("NO")
else:
	print("YES")
	def f(m, x, y):
		if m == 1:
			if x == 0:
				return [0, 1]
			else:
				return [1, 0]

		res = [x]
		for i in range(m):
			if (x>>i) % 2 != (y>>i) % 2:
				diff = i
				break
		s = (x % (2**diff)) + (((x // (2**(diff+1))) * 2**(diff+1)) >> 1)
		t = (y % (2**diff)) + (((y // (2**(diff+1))) * 2**(diff+1)) >> 1)
		#return s, t
		u = s^1
		left = f(m-1, s, u)
		right = f(m-1, u, t)
		#print(left, right)
		x_bit, y_bit = (x>>diff) % 2, (y>>diff) % 2
		left = [l % (2**diff) + (2**diff * x_bit) + (((l // (2**diff)) * 2**diff) << 1) for l in left]
		right = [r % (2**diff) + (2**diff * y_bit) + (((r // (2**diff)) * 2**diff) << 1) for r in right]
		return left + right
	print(*f(n, a, b))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        int[] arr4 = new int[n];
        int[] arr5 = new int[n];
        int[] arr6 = new int[n];
        int[] arr7 = new int[n];
        int[] arr8 = new int[n];
        int[] arr9 = new int[n];
        int[] arr10 = new int[n];
        int[] arr11 = new int[n];
        int[] arr12 = new int[n];
        int[] arr13 = new int[n];
        int[] arr14 = new int[n];
        int[] arr15 = new int[n];
        int[] arr16 = new int[n];
        int[] arr17 = new int[n];
        int[] arr18 = new int[n];
        int[] arr19 = new int[n];
        int[] arr20 = new int[n];
        int[] arr21 = new int[n];
        int[] arr22 = new int[n];
        int[] arr23 = new int[n];
        int[] arr24 = new int[n];
        int[] arr25 = new int[n];
        int[] arr26 = new int[n];
        int[] arr27 = new int[n];
        int[] arr28 = new int[n];
        int[] arr29 = new int[n];
        int[] arr30 = new int[n];
        int[] arr31 = new int[n];
        int[] arr32 = new int[n];
        int[] arr33 = new int[n];
        int[] arr34 = new int[n];
        int[] arr35 = new int[n];
        int[] arr36 = new int[n];
        int[] arr37 = new int[n];
        int[] arr38 = new int[n];
        int[] arr39 = new int[n];
        int[] arr40 = new int[n];
        int[] arr41 = new int[n];
        int[] arr42 = new int[n];
        int[] arr43 = new int[n];
        int[] arr44 = new int[n];
        int[] arr45 = new int[n];
        int[] arr46 = new int[n];
        int[] arr47 = new int[n];
        int[] arr48 = new int[n];
        int[] arr49 = new int[n];
        int[] arr50 = new int[n];
        int[] arr51 = new int[n];
        int[] arr52 = new int[n];
        int[] arr53 = new int[n];
        int[] arr54 = new int[n];
        int[] arr55 = new int[n];
        int[] arr56 = new int[n];
        int[] arr57 = new int[n];
        int[] arr58 = new int[n];
        int[] arr59 = new int[n];
        int[] arr60 = new int[n];
        int[] arr61 = new int[n];
        int[] arr62 = new int[n];
        int[] arr63 = new int[n];
        int[] arr64 = new int[n];
        int[] arr65 = new int[n];
        int[] arr66 = new int[n];
        int[] arr67 = new int[n];
        int[] arr68 = new int[n];
        int[] arr69 = new int[n];
        int[] arr70 = new int[n];
        int[] arr71 = new int[n];
        int[] arr72 = new int[n];
        int[] arr73 = new int[n];
        int[] arr74 = new int[n];
        int[] arr75 = new int[n];
        int[] arr76 = new int[n];
        int[] arr77 = new int[n];
        int[] arr78 = new int[n];
        int[] arr79 = new int[n];
        int[] arr80 = new int[n];
        int[] arr81 = new int[n];
        int[] arr82 = new int[n];
        int[] arr83 = new int[n];
        int[] arr84 = new int[n];
        int[] arr85 = new int[n];
        int[] arr86 = new int[n];
        int[] arr87 = new int[n];
        int[] arr88 = new int[n];
        int[] arr89 = new int[n];
        int[] arr90 = new int[n];
        int[] arr91 = new int[n];
        int[] arr92 = new int[n];
        int[] arr93 = new int[n];
        int[] arr94 = new int[n];
        int[] arr95 = new int[n];
        int[] arr96 = new int[n];
        int[] arr97 = new int[n];
        int[] arr98 = new int[n];
        int[] arr99 = new int[n];
        int[] arr100 = new int[n];
        int[] arr101 = new int[n];
        int[] arr102 = new int[n];
        int[] arr103 = new int[n];
        int[] arr104 = new int[n];
        int[] arr105 = new int[n];
        int[] arr106 = new int[n];
        int[] arr107 = new int[n];
        int[] arr108 = new int[n];
        int[] arr109 = new int[n];
        int[] arr110 = new int[n];
        int[] arr111 = new int[n];
        int[] arr112 = new int[n];
        int[] arr113 = new int[n];
        int[] arr114 = new int[n];
        int[] arr115 = new int[n];
        int[] arr116 = new int[n];
        int[] arr117 = new int[n];
        int[] arr118 = new int[n];
        int[] arr119 = new int[n];
        int[] arr120 = new int[n];
        int[] arr121
