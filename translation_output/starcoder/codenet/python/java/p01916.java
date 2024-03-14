<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
# AOJ 2816: Alphabet Block
# Python3 2018.7.11 bal4u

dic = {}
S = list(input())
for s in S:
	if s not in dic: dic[s] = 1
	else: dic[s] += 1
ans = 0
for k in list(dic.keys()):
	if dic[k] & 1: ans += 1
print(ans>>1)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'O' || s.charAt(i) == 'J' || s.charAt(i) == 'S' || s.charAt(i) == 'B' || s.charAt(i) == 'T' || s.charAt(i) == 'L' || s.charAt(i) == 'C' || s.charAt(i) == 'D' || s.charAt(i) == 'M') {
				ans++;
			}
		}
		System.out.println(ans>>1);
	}
}
```
<|endoftext|>
