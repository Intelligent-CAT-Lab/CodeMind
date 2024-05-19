System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		Map<Character, Integer> map = new HashMap<>();
		while ((line = br.readLine())!= null &&!line.isEmpty()) {
			char[] chars = line.toCharArray();
			for (char c : chars) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		}

		int count = 0;
		for (char c : map.keySet()) {
			if (map.get(c) % 2!= 0) {
				count++;
			}
		}
		System.out.println(count / 2);
	}
}
```<|endoftext|>
