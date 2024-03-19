<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
46979

Expected output:
13:2:9

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

def main():
    S = int(sys.stdin.readline().strip())
    h = S // 3600
    hi = S % 3600
    m = hi // 60
    s = S % 60
    print(f"{h}:{m}:{s}")

if __name__ == "__main__":
    main()
```
This code uses the `//` operator to perform integer division, which is equivalent to the `floor()` function in Java. The `%` operator is used to calculate the remainder of the division, which is equivalent to the `mod()` function in Java. The `f"{h}:{m}:{s}"` string is used to format the output in the same way as the Java code.</s>
