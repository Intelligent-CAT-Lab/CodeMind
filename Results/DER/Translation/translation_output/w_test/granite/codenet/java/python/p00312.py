System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 5

Expected output:
2


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


Answer:
```python
import sys

def main():
    input_str = sys.stdin.readline()
    s = input_str.split(" ")
    i1 = int(s[0])
    i2 = int(s[1])

    count = i1 // i2
    count += i1 % i2
    print(count)

if __name__ == "__main__":
    main()
```

Test input:
```
10 5
```

Expected output:
```
2
```<|endoftext|>
