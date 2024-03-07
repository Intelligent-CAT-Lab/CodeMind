<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    # Here your code !
    line = sys.stdin.readline()
    tmpArray = line.split(" ")
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
```
Note: The `sys` module is used to read input from the standard input stream, and the `readline()` method is used to read a line of input. The `split()` method is used to split the input line into a list of strings, and the `int()` function is used to convert the strings to integers. The `if` statement is used to check the conditions and print the appropriate message.</s>
