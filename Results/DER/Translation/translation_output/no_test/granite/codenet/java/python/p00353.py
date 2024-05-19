System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00353 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] input = sc.nextLine().split(" ");
      int m = Integer.parseInt(input[0]);
      int f = Integer.parseInt(input[1]);
      int b = Integer.parseInt(input[2]);
      
      if(b > m + f) {
         System.out.println("NA"); 
      } else if (b > m){
         System.out.println(b - m);
      } else {
         System.out.println("0");
      }
   }
}

```


Answer:
```python
import sys

input = sys.stdin.readline().split(" ")
m = int(input[0])
f = int(input[1])
b = int(input[2])

if b > m + f:
    print("NA") 
elif b > m:
    print(b - m)
else:
    print("0")
```<|endoftext|>
