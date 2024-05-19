System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
ar;dabcda}cdabcd}bcsaWcd5bcda=cdabcdabc`aOcdab4dabodabcdafcdabcwabcdabcdabcdabgdabud[bcdabAdaocd2bkd

```
import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println('a');
        } else if (n == 2) {
            System.out.println("ab");
        } else if (n == 3) {
            System.out.println("abc");
        } else {
            for (int i = 0; i < n / 4; i++) {
                System.out.print("abcd");
            }
            int t = n % 4;
            if (t == 1) {
                System.out.println('a');
            } else if (t == 2) {
                System.out.println("ab");
            } else if (t == 3) {
                System.out.println("abc");
            }
        }
    }
}
```


Answer:
```python
def codeforces_110_B(n):
    if n == 1:
        return 'a'
    elif n == 2:
        return "ab"
    elif n == 3:
        return "abc"
    else:
        result = ""
        for i in range(n // 4):
            result += "abcd"
        t = n % 4
        if t == 1:
            result += 'a'
        elif t == 2:
            result += "ab"
        elif t == 3:
            result += "abc"
        return result

# Test the function
print(codeforces_110_B(100))
```

Test input:
100

Expected output:
ar;dabcda}cdabcd}bcsaWcd5bcda=cdabcdabc`aOcdab4dabodabcdafcdabcwabcdabcdabcdabgdabud[bcdabAdaocd2bkd<|endoftext|>
