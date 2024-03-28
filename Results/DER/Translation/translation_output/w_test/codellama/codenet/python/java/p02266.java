<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
\\//

Expected output:
4
1 4


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
```
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
        System.out.println(puddles.length + " " + String.join(" ", puddles));
    }

    private static int func(char c) {
        switch (c) {
            case '_':
                return 0;
            case '/':
                return 1;
            case '\\':
                return -1;
            default:
                return 0;
        }
    }
}
```
This is a Java implementation of the Python code you provided. It uses a similar approach to the Python code, but with some differences in the syntax and data structures used.

The `func` method is used to convert the input characters to integers based on their values. The `g` array is used to store the values of the `func` method for each character in the input string, along with a boolean value indicating whether the character is a puddle or not.

The `gmax` variable is used to keep track of the maximum value in the `g` array, and the `puddles` array is used to store the volume of each puddle. The `volume` variable is used to keep track of the volume of the current puddle, and the `safaceLevel` variable is used to keep track of the level of the surface at the current position.

The `for` loop at the end of the code is used to calculate the sum of the volumes of all the puddles, and the `System.out.println` statements are used to print the results.</s>
