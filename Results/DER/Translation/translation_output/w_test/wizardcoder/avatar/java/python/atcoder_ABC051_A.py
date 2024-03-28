Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud,

Expected output:
pnxnn asadasd asdasf



```
import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        System.out.println(a + " " + b + " " + c);
    }
}
```

### Response:
```python
import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        System.out.println(a + " " + b + " " + c);
    }
}
```

The given java code is a simple program that reads three strings from the user using the Scanner class. The program then prints the three strings separated by a space. 

In python, we can achieve the same functionality using the input() function to read input from the user and print() function to print the output. Here's the solution:

```python
a = input()
b = input()
c = input()

print(a + " " + b + " " + c)
```

In this solution, we use the input() function to read the three strings from the user and store them in variables a, b, and c. We then use the print() function to print the three strings separated by a space.

Note that in python, we don't need to import the Scanner class as it is built-in. We can simply use the input() function to read input from the user.<|endoftext|>
