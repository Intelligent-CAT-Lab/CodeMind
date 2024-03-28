<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 3000 3000

Expected output:
2000


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

@@ Response
```python
# Python code

# Read input from user
m, f, b = map(int, input().split())

# Check if the total number of students is less than the number of books
if b > m + f:
    print("NA")
elif b > m:
    print(b - m)
else:
    print("0")
```

This Python code does the same thing as the Java code. It reads three integers from the user, checks if the total number of students is less than the number of books, and then prints the appropriate output.<｜end▁of▁sentence｜>
