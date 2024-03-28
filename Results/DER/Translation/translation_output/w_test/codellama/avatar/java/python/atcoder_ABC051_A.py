<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

input_str = sys.stdin.read()

# Split the input string by commas
a, b, c = input_str.split(",")

# Print the output
print(a, b, c, sep=" ")
```
This code uses the `sys` module to read the input from stdin, and the `split` method to split the input string by commas. The output is then printed using the `print` function with the `sep` argument set to a space.</s>
