<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
214

```
import java.util.Scanner;

public class p03023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int answer = 180 * (num - 2);

        System.out.println(answer);
    }
}

```
[/INST]
```
import math

def main():
    num = int(input("Enter a number: "))
    answer = 180 * (num - 2)
    print(answer)

if __name__ == "__main__":
    main()
```
This code uses the `math` module to perform the multiplication operation. It also uses the `input()` function to get the user input and the `print()` function to display the result.

Note that the `if __name__ == "__main__":` block is used to ensure that the `main()` function is only executed when the script is run as a standalone program, and not when it is imported as a module.</s>
