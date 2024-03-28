<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 0

Expected output:
5


```
import java.util.*;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anser = 0;
        int[] count = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            count[i] += x;
            
            if (count[i] == 0) {
                anser = i;
            }
        }
        
        System.out.println(anser + 1);
    }
}
```
[/INST]
```
import sys

def main():
    input_list = sys.stdin.read().split()
    count = [0] * 5
    for i in range(5):
        count[i] += int(input_list[i])
        if count[i] == 0:
            print(i + 1)
            break

if __name__ == "__main__":
    main()
```
This is the Python code that translates the given Java code. The `sys` module is used to read the input from the standard input stream, and the `split()` method is used to split the input into a list of integers. The `count` list is initialized with 5 zeros, and the `for` loop iterates over the input list, adding each element to the corresponding index in the `count` list. If the element is 0, the `anser` variable is set to the current index, and the loop is exited. Finally, the `print()` function is used to output the result.</s>
