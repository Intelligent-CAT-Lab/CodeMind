Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import java.util.Scanner;

class p04029:

  def main(self):
    sc = Scanner(System.in)
    
    sum = 0
    n = sc.nextInt()
    for i in range(1, n+1):
        sum += i
    print(sum)

p04029().main()
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We define a class `p04029` which contains a `main` method.
- Inside the `main` method, we create an object of the `Scanner` class and read the input integer `n` from the user using the `nextInt()` method.
- We initialize a variable `sum` to 0 and use a `for` loop to iterate from 1 to `n`. Inside the loop, we add the current value of `i` to the `sum` variable.
- Finally, we print the value of `sum` using the `println()` method of the `System.out` object.<|endoftext|>
