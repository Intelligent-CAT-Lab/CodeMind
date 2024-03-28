Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 2 5

Expected output:
84


```
    import java.util.*;
    public class p03478 {
      public static void main(String...args) {
      	final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= N; i++) {
          int sum = 0;
          for(int j = i; j > 0; j /= 10)
            sum += j % 10;
          if(A <= sum && sum <= B)
            ans += i;
        }
        System.out.println(ans);
      }
    }
```

### Response:
```python
import java.util.*;

public class p03478 {
  public static void main(String...args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = 0;
    for(int i = 1; i <= N; i++) {
      int sum = 0;
      int j = i;
      while(j > 0) {
        sum += j % 10;
        j /= 10;
      }
      if(A <= sum && sum <= B)
        ans += i;
    }
    System.out.println(ans);
  }
}
```

Explanation:

- We first import the `java.util` package to use the `Scanner` class.
- We then create a `Scanner` object to read input from the standard input stream.
- We read the input values `N`, `A`, and `B` from the `Scanner` object.
- We initialize a variable `ans` to 0 to store the answer.
- We use a `for` loop to iterate from 1 to `N`.
- Inside the loop, we initialize a variable `sum` to 0 to store the sum of digits of `i`.
- We use a `while` loop to iterate over the digits of `i`.
- Inside the loop, we add the last digit of `j` to `sum` and divide `j` by 10 to remove the last digit.
- After the loop, we check if `A` is less than or equal to `sum` and `sum` is less than or equal to `B`.
- If the condition is true, we add `i` to `ans`.
- Finally, we print the value of `ans` to the standard output stream.<|endoftext|>
