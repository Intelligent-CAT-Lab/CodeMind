System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 3000 3000

Expected output:
2032

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

def main():
    input = sys.stdin.readline().split()
    m = int(input[0])
    f = int(input[1])
    b = int(input[2])

    if b > m + f:
        print("NA")
    elif b > m:
        print(b - m)
    else:
        print("0")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "1000 3000 3000"
expected_output = "2032"

output = io.StringIO()
with redirect_stdout(output):
    main()

assert output.getvalue().strip() == expected_output
```<|endoftext|>
