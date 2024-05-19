System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
B6M

```
import java.util.Arrays;
import java.util.Scanner;

public class p02987 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s= sc.next().toCharArray();
		Arrays.sort(s);
		if (s[0]==s[1]&&s[2]==s[3]&&s[1]!=s[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

```


Answer:
```python
def main():
    s = input()
    s = sorted(s)
    if s[0] == s[1] and s[2] == s[3] and s[1]!= s[2]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

Test input:
```
ASSA
```

Expected output:
```
Yes
```<|endoftext|>
