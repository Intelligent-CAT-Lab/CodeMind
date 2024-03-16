<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
    reader = sys.stdin
    try:
        str1 = reader.readline()
        s = str1.split()
        i1 = int(s[0])
        i2 = int(s[1])

        count = i1 // i2 + i1 % i2
        print(count)
    except Exception as e:
        e.printStackTrace()

if __name__ == "__main__":
    main()
```</s>
