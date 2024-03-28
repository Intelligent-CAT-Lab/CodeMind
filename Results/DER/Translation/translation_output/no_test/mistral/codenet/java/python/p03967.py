<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;

public class p03967 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String top = r.readLine();
		boolean cpp = false;
		int score = 0;
		for (int j = 0; j < top.length(); j++) {
			if (cpp) {
				if (top.charAt(j) == 'g')
					score++;
				cpp = false;
			}
			else {
				if (top.charAt(j) == 'p')
					score--;
				cpp = true;
			}
		}
		System.out.println(score);
	}

}
```
[/INST]
```python
import sys

top = input()
cpp = False
score = 0
for j in range(len(top)):
    if cpp:
        if top[j] == 'g':
            score += 1
        cpp = False
    else:
        if top[j] == 'p':
            score -= 1
        cpp = True
print(score)
```</s>
