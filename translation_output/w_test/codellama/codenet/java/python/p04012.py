<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abaccaba

Expected output:
Yes


```
import java.util.*;

public class p04012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		char[] c = w.toCharArray();
		char a = 'a';
		int acha = (int)a;
		a = 'z';
		int zcha = (int)a;
		int count = 0;
		for (int i = acha; i < zcha + 1; i++) {
			for (char x: c) {
				if (x == (char)i) {
					count++;
				}
			}
			if (count % 2 == 1) {
				System.out.println("No");
				return;
			}
			count = 0;
		}
		System.out.println("Yes");
	}
}
```
[/INST]
```
import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        char[] c = w.toCharArray();
        char a = 'a';
        int acha = (int)a;
        a = 'z';
        int zcha = (int)a;
        int count = 0;
        for (int i = acha; i < zcha + 1; i++) {
            for (char x: c) {
                if (x == (char)i) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                System.out.println("No");
                return;
            }
            count = 0;
        }
        System.out.println("Yes");
    }
}
```

Here is the Python code that translates the Java code:
```
import java.util.Scanner;

public class p04012:
    def main(self, args):
        sc = Scanner(System.in)
        w = sc.next()
        c = w.toCharArray()
        a = 'a'
        acha = ord(a)
        a = 'z'
        zcha = ord(a)
        count = 0
        for i in range(acha, zcha + 1):
            for x in c:
                if x == chr(i):
                    count += 1
            if count % 2 == 1:
                print("No")
                return
            count = 0
        print("Yes")
```
Note that the `ord()` function is used to get the ASCII value of a character, and the `chr()` function is used to convert an ASCII value to a character.</s>
