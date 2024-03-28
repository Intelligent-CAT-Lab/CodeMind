Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3400

```
import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b)
            for (int i = 0; i < a; i++)
                System.out.print(b);
        else
            for (int i = 0; i < b; i++)
                System.out.print(a);

    }
}

```

### Response:
```python
import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b)
            for (int i = 0; i < a; i++)
                System.out.print(b);
        else
            for (int i = 0; i < b; i++)
                System.out.print(a);

    }
}
```

The given java code is a simple program that takes two integers as input from the user and prints the smaller integer multiple times. The program uses a for loop to print the smaller integer multiple times. The if-else statement is used to determine which integer is smaller and then prints the smaller integer multiple times.

In python, we can achieve the same functionality using a for loop and the input() function to take two integers as input from the user. Here's the equivalent python code:

```python
a = int(input())
b = int(input())

if a >= b:
    for i in range(a):
        print(b)
else:
    for i in range(b):
        print(a)
```

In this code, we first take two integers as input using the input() function and convert them to integers using the int() function. We then use an if-else statement to determine which integer is smaller and print the smaller integer multiple times using a for loop. The range() function is used to generate a sequence of numbers from 0 to a-1 or b-1, depending on which integer is smaller. Finally, we print the integer multiple times using the print() function.<|endoftext|>
