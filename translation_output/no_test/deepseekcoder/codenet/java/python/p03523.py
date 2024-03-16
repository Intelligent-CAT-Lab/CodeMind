<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    akihabara = "AKIHABARA"
    kihbr = "KIHBR"
    s = sys.stdin.readline().strip()

    j = 0
    k = 0
    for i in range(len(s)):
        if j+1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j] != s[i]:
            j += 1

        if j >= len(akihabara) or akihabara[j] != s[i]:
            print("NO")
            return
        if s[i] != 'A':
            if s[i] == kihbr[k]:
                k += 1
            else:
                print("NO")
                return

        j += 1

    if k == len(kihbr):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, and then checks if the string matches the pattern described in the Java code. If it does, it prints "YES"; otherwise, it prints "NO".
<|EOT|>
