Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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
        // Here your code!
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

### Response:
```python
import sys

def main():
    # Read input from stdin
    overLimit, prevDay, overDay = map(int, sys.stdin.readline().split())

    # Check if the previous day is greater than or equal to the overDay
    if prevDay >= overDay:
        print("delicious")
    # Check if the previous day plus the overLimit is less than the overDay
    elif prevDay + overLimit < overDay:
        print("dangerous")
    # Otherwise, the fish is safe
    else:
        print("safe")

if __name__ == "__main__":
    main()
```<|endoftext|>
