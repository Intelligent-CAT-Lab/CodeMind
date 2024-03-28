<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
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

Here is the Python code that translates the Java code:
```
import java.util.Arrays;
import java.util.Scanner;

public class p02987:

    def main(self, args):
        sc = Scanner(System.in)
        s = sc.next().toCharArray()
        Arrays.sort(s)
        if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
            print("Yes")
        else:
            print("No")

```
Note that the Python code is not exactly the same as the Java code, as Python does not have the same syntax and structure as Java. However, the logic and algorithm used in the Java code can be translated to Python with some modifications.</s>
