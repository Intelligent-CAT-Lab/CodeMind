<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def main():
    line = sys.stdin.readline()
    tmpArray = line.split()
    overLimit = int(tmpArray[0])
    prevDay = int(tmpArray[1])
    overDay = int(tmpArray[2])
    if prevDay >= overDay:
        print("delicious")
    elif prevDay + overLimit < overDay:
        print("dangerous")
    else:
        print("safe")

if __name__ == "__main__":
    main()
```</s>
