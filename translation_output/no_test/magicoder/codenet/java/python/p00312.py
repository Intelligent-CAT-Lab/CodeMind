<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

def main():
    try:
        str1 = sys.stdin.readline().strip()
        i1, i2 = map(int, str1.split())
        count = i1 // i2
        count += i1 % i2
        print(count)
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, divides the first one by the second one, adds the remainder to the result, and then prints the result. If any error occurs during the execution, it will be caught and printed.<｜end▁of▁sentence｜>
