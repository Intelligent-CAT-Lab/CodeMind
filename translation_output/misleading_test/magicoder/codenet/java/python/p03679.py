<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3 6

Expected output:
safe

```
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p03679 {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        String[] tmpArray = line.split(" ");
        
        int overLimit = Integer.parseInt(tmpArray[0]);
        int prevDay = Integer.parseInt(tmpArray[1]);
        int overDay = Integer.parseInt(tmpArray[2]);
        
        if(prevDay >= overDay){
            System.out.println("delicious");
        }
        else if(prevDay + overLimit < overDay){
            System.out.println("dangerous");
        }
        else {
            System.out.println("safe");
        }
    }
}

```

@@ Response
```python
# Here your code !
import sys

line = sys.stdin.readline().split()

overLimit = int(line[0])
prevDay = int(line[1])
overDay = int(line[2])

if prevDay >= overDay:
    print("delicious")
elif prevDay + overLimit < overDay:
    print("dangerous")
else:
    print("safe")
```

This Python code does the same thing as the Java code. It reads input from the standard input, splits it into three parts, converts them into integers, and then checks the conditions as in the Java code. The `sys.stdin.readline().split()` part is equivalent to `br.readLine().split(" ")` in the Java code.<｜end▁of▁sentence｜>
