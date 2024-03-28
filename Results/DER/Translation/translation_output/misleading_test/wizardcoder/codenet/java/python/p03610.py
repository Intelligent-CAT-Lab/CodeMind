Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
acdro

```
import java.util.*;

class p03610{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");

        for(int i = 0; i < s.length(); i += 2){
            System.out.print(array[i]);
        }
        
    }
}
```

### Response:
```python
import java.util.*;

class p03610{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");

        for i in range(0, s.length(), 2):
            System.out.print(array[i]);
    }
}
```

Explanation:

- We first import the `java.util` package to use the `Scanner` class.
- We define a class `p03610` which contains a `main` method.
- Inside the `main` method, we create a `Scanner` object to read input from the user.
- We read the input string `s` from the user using the `next()` method of the `Scanner` class.
- We split the input string into an array of characters using the `split()` method of the `String` class.
- We loop through the array using a `for` loop and print the characters at even indices.
- We use the `range()` function to generate a sequence of even numbers from 0 to `s.length()` with a step size of 2.
- We print the characters at even indices using the `print()` function.<|endoftext|>
