System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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
				akihabara.charAt(j)!= s.charAt(i)
			) {
				j++;
			}

			if(j >= akihabara.length() || akihabara.charAt(j)!= s.charAt(i)) {
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


Answer:
```python
import sys

akihabara = "AKIHABARA"
kihbr = "KIHBR"
s = sys.stdin.readline().strip()

i = 0
j = 0
k = 0
for c in s:
    if j+1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j]!= c:
        j += 1
    if j >= len(akihabara) or akihabara[j]!= c:
        print("NO")
        exit()
    if c!= 'A':
        if c == kihbr[k]:
            k += 1
        else:
            print("NO")
            exit()
    j += 1
if k == len(kihbr):
    print("YES")
else:
    print("NO")
```<|endoftext|>
