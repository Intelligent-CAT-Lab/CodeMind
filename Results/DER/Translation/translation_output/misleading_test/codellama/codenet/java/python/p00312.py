<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 5

Expected output:
-95

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class p00312 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str1 = reader.readLine();
	    String s[]=str1.split(" ");
	    int i1=Integer.parseInt(s[0]);
	    int i2=Integer.parseInt(s[1]);

	    int count=i1/i2;
	    count+=i1%i2;
	    System.out.println(count);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


```
[/INST]
```python
import sys

def main():
    num1, num2 = map(int, sys.stdin.readline().split())
    count = num1 // num2
    count += num1 % num2
    print(count)

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input strings to integers. The `//` operator is used for integer division, and the `%` operator is used for modulo division. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` method is used to split the input string into two parts, and the `int()` function is used to convert the two parts to integers.</s>
