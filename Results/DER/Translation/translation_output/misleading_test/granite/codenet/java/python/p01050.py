System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0ig3he12fz99

Expected output:
-38

```

import java.util.Scanner;

public class p01050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s;
		String sd = "abcdefghijklmnopqrstuvwxyz";
		String sdnum = "0123456789";
		s = sc.next();
		int count[];
		int countnum[];
		count = new int[26];
		countnum = new int[10];

		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				++countnum[s.charAt(i) - '0'];
			}
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				++count[s.charAt(i) - 'a'];
			}
		}

		int ans = 0;
		for (int i = 26; i >= 3; --i) {
			for (int j = 0; j <= 26 - i; ++j) {
				int tmp = 10000;
				for (int k = j; k < j + i; ++k) {
					tmp = Math.min(tmp, count[k]);
				}
				ans += tmp * 3;
				for (int k = j; k < j + i; ++k) {
					count[k] -= tmp;
				}
			}
		}
		for (int i = 0; i < 26; ++i) {
			ans += count[i];
		}

		for (int i = 10; i >= 3; --i) {
			for (int j = 0; j <= 10 - i; ++j) {
				int tmp = 10000;
				for (int k = j; k < j + i; ++k) {
					tmp = Math.min(tmp, countnum[k]);
				}
				ans += tmp * 3;
				for (int k = j; k < j + i; ++k) {
					countnum[k] -= tmp;
				}
			}
		}
		for (int i = 0; i < 10; ++i) {
			ans += countnum[i];
		}

		System.out.println(ans);
		sc.close();
	}

}


```


Answer:
```python
def main():
    s = input()
    count = [0] * 26
    countnum = [0] * 10

    for c in s:
        if c.isdigit():
            countnum[int(c)] += 1
        elif c.isalpha():
            count[ord(c) - ord('a')] += 1

    ans = 0
    for i in range(26, 2, -1):
        for j in range(26 - i + 1):
            tmp = 10000
            for k in range(j, j + i):
                tmp = min(tmp, count[k])
            ans += tmp * 3
            for k in range(j, j + i):
                count[k] -= tmp

    for i in range(26):
        ans += count[i]

    for i in range(10, 1, -1):
        for j in range(10 - i + 1):
            tmp = 10000
            for k in range(j, j + i):
                tmp = min(tmp, countnum[k])
            ans += tmp * 3
            for k in range(j, j + i):
                countnum[k] -= tmp

    for i in range(10):
        ans += countnum[i]

    print(ans)

if __name__ == "__main__":
    main()
```<|endoftext|>
