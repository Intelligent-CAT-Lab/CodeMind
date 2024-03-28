<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    str1 = sys.stdin.readline()
    s = str1.split(" ")
    i1 = int(s[0])
    i2 = int(s[1])

    count = i1 // i2
    count += i1 % i2
    print(count)

if __name__ == "__main__":
    main()
```
Note: The `//` operator is used for integer division in Python, which is equivalent to the `floor` function in Java. The `%` operator is used for modulo division in Python, which is equivalent to the `remainder` function in Java.</s>
