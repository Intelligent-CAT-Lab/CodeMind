System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p03109{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String time=scn.next().substring(5);
        if(time.charAt(0)=='1'||Character.getNumericValue(time.charAt(1))>4) {
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }
}

```


Answer:
```python
import sys

time = sys.stdin.readline().strip()[-2:]

if time[0] == '1' or int(time[1]) > 4:
    print("TBD")
else:
    print("Heisei")
```<|endoftext|>
