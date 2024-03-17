<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
46979

Expected output:
13:2:59


```
import java.util.Scanner;

public class p02390{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int h = S / 3600;
        int hi = S % 3600;
        int m = hi / 60;
        int s = S % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}

```
[/INST]
```
import sys

S = int(sys.stdin.readline())
h = S // 3600
hi = S % 3600
m = hi // 60
s = S % 60
print(f"{h}:{m}:{s}")
```
Explanation:

* `import sys` is used to import the `sys` module, which provides access to the standard input and output streams.
* `S = int(sys.stdin.readline())` reads a line of input from the standard input stream and converts it to an integer.
* `h = S // 3600` calculates the number of hours by dividing the input by 3600.
* `hi = S % 3600` calculates the number of hours and minutes by taking the remainder of the input divided by 3600.
* `m = hi // 60` calculates the number of minutes by dividing the number of hours and minutes by 60.
* `s = S % 60` calculates the number of seconds by taking the remainder of the input divided by 60.
* `print(f"{h}:{m}:{s}")` prints the output in the format "h:m:s".

Note: The `f` in front of the string is called an f-string, which is a new feature in Python 3.6 that allows for formatted string literals. It allows you to include variables in the string and have them be formatted automatically.</s>
