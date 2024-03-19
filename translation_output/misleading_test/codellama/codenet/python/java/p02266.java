<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
\\//

Expected output:
-95
14

```
def func(c):
    global cnt
    cnt += {'_':0, '/':1, '\\':-1}[c]
    return cnt

cnt = 0
g = [[0, False]] + [[func(c), False] for c in input()]

gmax = g[0][0]
for i in range(1, len(g)):
    if g[i - 1][0] < g[i][0] <= gmax :
        g[i][1] = True
    gmax = max(gmax, g[i][0])

puddles = []
volume = 0
saface_level = None

for i in range(len(g) - 1, -1, -1):
    if saface_level != None:
        volume += saface_level  - g[i][0]
        if saface_level == g[i][0]:
            puddles += [volume]
            saface_level = None
            volume = 0
    if saface_level == None and g[i][1]:
        saface_level = g[i][0] 

puddles = puddles[::-1]
print(sum(puddles))
print(len(puddles), *puddles)
```
[/INST]
```java
import java.util.Scanner;

public class Puddles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[][] g = new int[input.length() + 1][2];
        g[0][0] = 0;
        g[0][1] = false;
        for (int i = 1; i < g.length; i++) {
            g[i][0] = func(input.charAt(i - 1));
            g[i][1] = false;
        }

        int gmax = g[0][0];
        for (int i = 1; i < g.length; i++) {
            if (g[i - 1][0] < g[i][0] && g[i][0] <= gmax) {
                g[i][1] = true;
            }
            gmax = Math.max(gmax, g[i][0]);
        }

        int[] puddles = new int[g.length - 1];
        int volume = 0;
        int safaceLevel = null;

        for (int i = g.length - 1; i >= 0; i--) {
            if (safaceLevel != null) {
                volume += safaceLevel - g[i][0];
                if (safaceLevel == g[i][0]) {
                    puddles[i] = volume;
                    safaceLevel = null;
                    volume = 0;
                }
            }
            if (safaceLevel == null && g[i][1]) {
                safaceLevel = g[i][0];
            }
        }

        int sum = 0;
        for (int i = 0; i < puddles.length; i++) {
            sum += puddles[i];
        }

        System.out.println(sum);
        System.out.println(puddles.length);
        for (int i = 0; i < puddles.length; i++) {
            System.out.print(puddles[i] + " ");
        }
    }

    public static int func(char c) {
        int cnt = 0;
        switch (c) {
            case '_':
                cnt = 0;
                break;
            case '/':
                cnt = 1;
                break;
            case '\\':
                cnt = -1;
                break;
        }
        return cnt;
    }
}
```
This is the Java code for the given Python code. I have used the `Scanner` class to read the input from the user and the `Math` class to perform mathematical operations. I have also used the `switch` statement to implement the `func` function.

The code first reads the input from the user and stores it in a string variable. It then initializes an array of arrays `g` with the length of the input string plus one. The first element of the array is set to 0, and the second element is set to false.

The code then loops through the input string and for each character, it calls the `func` function to get the corresponding value and sets the first element of the array to that value and the second element to false.

The code then finds the maximum value in the array and sets it to `gmax`. It then loops through the array again and for each element, it checks if the previous element is less than the current element and the current element is less than or equal to `gmax`. If this condition is true, it sets the second element of the current element to true.

The code then initializes an array `puddles` with the length of the input string minus one. It then initializes a variable `volume` to 0 and a variable `safaceLevel` to null.

The code then loops through the array `g` in reverse order and for each element, it checks if `safaceLevel` is not null. If it is not null, it calculates the volume of the puddle and sets the first element of the current element to that value. It then checks if the first element of the current element is equal to `safaceLevel`. If it is, it sets the second element of the current element to the volume and sets `safaceLevel` to null.

The code then calculates the sum of the puddles and prints it. It then prints the length of the puddles and the values of the puddles.

I hope this helps! Let me know if you have any questions.</s>
