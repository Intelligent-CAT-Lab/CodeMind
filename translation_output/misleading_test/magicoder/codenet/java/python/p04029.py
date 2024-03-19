<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1

```
import java.util.Scanner;

class p04029{

  public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    int n = sc.nextInt();
    for(int i = 1;i<=n;i++){
    sum = sum + i;
    }
    System.out.println(sum);
  }

}
```

@@ Response
```python
# Python code

n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i
print(sum)
```

In this Python code, we are taking the input from the user and then using a for loop to calculate the sum of all numbers from 1 to n. The result is then printed out.<｜end▁of▁sentence｜>
