<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    line = sys.stdin.readline().strip()
    overLimit, prevDay, overDay = map(int, line.split())

    if prevDay >= overDay:
        print("delicious")
    elif prevDay + overLimit < overDay:
        print("dangerous")
    else:
        print("safe")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line from the standard input, splits it into three integers, and then checks the conditions as in the Java code. The `strip()` function is used to remove the newline character at the end of the line. The `map(int, line.split())` line is equivalent to the Java code's `Integer.parseInt(tmpArray[i])` lines.<｜end▁of▁sentence｜>
