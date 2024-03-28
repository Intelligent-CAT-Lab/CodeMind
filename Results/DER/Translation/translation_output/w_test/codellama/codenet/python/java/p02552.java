<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
0


```
print(1 - int(input()))
```
[/INST]
```
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(1 - input);
    }
}
```
This code reads an integer from the user using the `Scanner` class, and then prints the result of subtracting 1 from that integer. The `nextInt()` method is used to read the integer from the user, and the `println()` method is used to print the result.</s>
