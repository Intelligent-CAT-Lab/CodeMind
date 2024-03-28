<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YES


```
import java.util.Scanner;

public class p03523 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String akihabara = "AKIHABARA";
		String kihbr = "KIHBR";
		String s = scanner.nextLine();

		int i;
		int j = 0;
		int k = 0;
		for(i = 0; i < s.length(); i++){
			if(
				j+1 < akihabara.length() &&
				akihabara.charAt(j) == 'A' &&
				akihabara.charAt(j) != s.charAt(i)
			) {
				j++;
			}

			if(j >= akihabara.length() || akihabara.charAt(j) != s.charAt(i)) {
				System.out.println("NO");
				return;
			}
			if(s.charAt(i)!='A') {
				if(s.charAt(i) == kihbr.charAt(k)) {
					k++;
				} else {
					System.out.println("NO");
					return;
				}
			}
			
			j++;
		}
		if(k == kihbr.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

```

### Response:
```python
import sys

def solve(s):
    akihabara = "AKIHABARA"
    kihbr = "KIHBR"

    j = 0
    k = 0
    for i in range(len(s)):
        if j+1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j] != s[i]:
            j += 1

        if j >= len(akihabara) or akihabara[j] != s[i]:
            return "NO"
        if s[i] != 'A':
            if s[i] == kihbr[k]:
                k += 1
            else:
                return "NO"
        j += 1

    if k == len(kihbr):
        return "YES"
    else:
        return "NO"

s = sys.stdin.readline().strip()
print(solve(s))
```

This Python code reads a string from the standard input, and then uses a function `solve` to determine if the string matches the pattern described in the Java code. If the string matches, the function returns "YES"; otherwise, it returns "NO". The result is then printed to the standard output.
<|EOT|>
