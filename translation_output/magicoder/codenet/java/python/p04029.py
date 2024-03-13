<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

# importing the in-built module for taking input
import sys

def main():
    # taking input from the user
    n = int(sys.stdin.readline())

    # initializing the sum
    sum = 0

    # looping from 1 to n
    for i in range(1, n+1):
        # adding the current number to the sum
        sum = sum + i

    # printing the sum
    print(sum)

# calling the main function
if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the sum of all numbers from 1 to that integer, and then prints the sum.<｜end▁of▁sentence｜>
