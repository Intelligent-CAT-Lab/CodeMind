<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int[] L = new int[a + b + c];
        for (int i = 0; i < a; i++) {
            L[i] = 0;
        }
        for (int i = a; i < a + b; i++) {
            L[i] = 1;
        }
        for (int i = a + b; i < a + b + c; i++) {
            L[i] = 2;
        }

        while (L.length > 1) {
            L[0] += L.pop();
            L.sort();
        }

        String result = "";
        for (int i = 0; i < L[0]; i++) {
            if (i == 0) {
                result += "a";
            } else if (i == 1) {
                result += "b";
            } else {
                result += "c";
            }
        }
        System.out.println(result);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read the input from the user, and then it creates an array `L` of size `a + b + c` and initializes it with the values `0`, `1`, and `2` based on the input.

The code then uses a `while` loop to iterate over the array `L` and perform the operations you described in the Python code. The `while` loop continues until the length of the array `L` is greater than 1, at which point it breaks out of the loop.

Finally, the code uses a `for` loop to iterate over the array `L` and print the result. The `for` loop iterates over the array `L` and checks the value of each element. If the element is 0, it prints "a", if it's 1, it prints "b", and if it's 2, it prints "c". The result is then printed to the console.</s>
