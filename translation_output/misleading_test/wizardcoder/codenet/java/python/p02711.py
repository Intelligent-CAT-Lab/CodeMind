Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
117

Expected output:
Ys

```
import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7")? "Yes" : "No");
    }
}
```

### Response:
```python
import java.util.Scanner;

class p02711:
    def main(self):
        s = Scanner(System.in)
        n = s.nextInt()
        string = str(n)
        print("Yes" if "7" in string else "No")
```

Explanation:

- We import the `java.util.Scanner` class to read input from the user.
- We define a class `p02711` with a method `main` that takes no arguments.
- Inside the `main` method, we create a new instance of the `Scanner` class and read an integer input from the user using the `nextInt` method.
- We convert the integer input to a string using the `str` function.
- We check if the string contains the character "7" using the `in` operator.
- If the condition is true, we print "Yes", otherwise we print "No".<|endoftext|>
