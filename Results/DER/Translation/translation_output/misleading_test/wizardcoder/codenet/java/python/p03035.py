Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
30 100

Expected output:
23

```
import java.util.*;

class p03035{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a<=5){
      System.out.println(0);
    }
    else if(a<=12){
      System.out.println((int)(b/2));
    }
    else{
      System.out.println(b);
    }
  }
}
```

### Response:
```python
import java.util.*;

class p03035:
  def main(self):
    sc = Scanner(System.in)
    a = sc.nextInt()
    b = sc.nextInt()
    
    if a <= 5:
      print(0)
    elif a <= 12:
      print(b//2)
    else:
      print(b)
```

Explanation:

- We import the `java.util` package to use the `Scanner` class.
- We define a class `p03035` with a method `main` that takes no arguments.
- We create an instance of the `Scanner` class to read input from the standard input stream.
- We read two integers `a` and `b` from the input stream using the `nextInt()` method of the `Scanner` class.
- We use an `if-elif-else` statement to check the value of `a` and print the corresponding output.
- In the first `if` block, we print `0` if `a` is less than or equal to `5`.
- In the second `elif` block, we print `b/2` if `a` is greater than `5` and less than or equal to `12`. We use integer division (`//`) to perform the division.
- In the third `else` block, we print `b` if `a` is greater than `12`.<|endoftext|>
