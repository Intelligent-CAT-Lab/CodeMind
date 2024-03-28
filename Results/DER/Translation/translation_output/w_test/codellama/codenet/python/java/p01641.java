<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABC

Expected output:
++++++++[>++++++++<-]>+.+.+.


```
import math

s = raw_input()

memory = [i for i in range(30, 121, 10)]
r = ''
r += ''.join(['+'*i+'>' for i in range(30, 121, 10)])
r += '<' * 10

point = 0
for c in s:
    c = ord(c)
    n = c / 10 - 3
    d = int(math.fabs(point - n))
    if point < n:
        r += '>' * d
    else:
        r += '<' * d
    point = n

    l = int(math.fabs(memory[point] - c))
    if memory[point] < c:
        r += '+' * l
    else:
        r += '-' * l
    memory[point] = c

    r += '.'

print r
```
[/INST]
```java
import java.util.Scanner;

public class Brainfuck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] memory = new int[30];
        for (int i = 0; i < 30; i++) {
            memory[i] = i * 10;
        }
        String output = "";
        int point = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int n = (int) c / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                output += ">" + ">".repeat(d);
            } else {
                output += "<".repeat(d);
            }
            point = n;
            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                output += "+".repeat(l);
            } else {
                output += "-".repeat(l);
            }
            memory[point] = c;
            output += ".";
        }
        System.out.println(output);
    }
}
```
This code takes a string as input and converts it to a Brainfuck program. It uses a 30-element array to store the values of the memory cells, and it uses a `for` loop to iterate over the characters in the input string. For each character, it calculates the corresponding Brainfuck command and appends it to the output string. The `Math.abs` method is used to calculate the absolute value of the difference between the current memory cell and the character's value. The `repeat` method is used to repeat a string a certain number of times.</s>
