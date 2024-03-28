<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1199

Expected output:
QBc

```
import java.util.*;

public class p03288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}

```
[/INST]
```
import java.util.Scanner;

public class p03288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}
```

Here's the Python code that translates the Java code:
```
import java.util.Scanner;

def main(args):
    sc = Scanner(System.in);
    r = sc.nextLong();
    if r < 1200:
        print("ABC");
    elif r < 2800:
        print("ARC");
    else:
        print("AGC");
```
Note that the `elif` keyword is used instead of `else if` in Python. Also, the `print` function is used instead of `System.out.println` in Python.</s>
