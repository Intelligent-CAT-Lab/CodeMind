<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    line = sys.stdin.readline()
    i1, i2 = map(int, line.split())
    count = i1 // i2
    count += i1 % i2
    print(count)

if __name__ == "__main__":
    main()
```

In Python, the `//` operator is used for integer division (rounding down to the nearest whole number), and the `%` operator is used for modulus (the remainder of the division). The `sys.stdin.readline()` function is used to read a line from the standard input, similar to the `BufferedReader.readLine()` method in Java. The `map()` function is used to convert the input strings to integers.
<|EOT|>
