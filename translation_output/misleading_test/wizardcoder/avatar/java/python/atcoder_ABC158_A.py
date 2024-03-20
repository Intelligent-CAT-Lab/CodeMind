Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBA

Expected output:
Yzes

```
import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.equals("AAA") || str.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

### Response:
```python
import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.equals("AAA") || str.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

The given java code is a simple program that takes a string input from the user and checks if it is equal to "AAA" or "BBB". If it is, it prints "No". Otherwise, it prints "Yes". 

Here's the equivalent python code:

```python
import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str == "AAA" or str == "BBB"):
            print("No")
        else:
            print("Yes")
    }
}
```

In python, we use the `==` operator to compare two strings. The `or` operator is used to combine two conditions using the logical OR operator. The `print` function is used to output the result to the console.<|endoftext|>
