<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
71.9582768814121

```
print(int(input())*6.28)
```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double result = input * 6.28;
        System.out.println(result);
    }
}
```
This code takes an integer input from the user, multiplies it by 6.28, and then prints the result to the console.

Here's a breakdown of the code:

* `Scanner scanner = new Scanner(System.in);`: This line creates a new `Scanner` object that reads input from the console.
* `int input = scanner.nextInt();`: This line reads an integer from the console using the `nextInt()` method of the `Scanner` object.
* `double result = input * 6.28;`: This line multiplies the input by 6.28 and stores the result in a `double` variable.
* `System.out.println(result);`: This line prints the result to the console using the `println()` method of the `System.out` object.

Note that the `Scanner` class is used to read input from the console, and the `System.out` class is used to print output to the console.</s>
