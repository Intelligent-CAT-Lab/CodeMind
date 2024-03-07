<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Puddles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int[][] g = new int[input.length()][2];
    int cnt = 0;
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == '_') {
        cnt = 0;
      } else if (c == '/') {
        cnt++;
      } else if (c == '\\') {
        cnt--;
      }
      g[i][0] = cnt;
      g[i][1] = false;
    }

    int gmax = g[0][0];
    for (int i = 1; i < g.length; i++) {
      if (g[i - 1][0] < g[i][0] && g[i][0] <= gmax) {
        g[i][1] = true;
      }
      gmax = Math.max(gmax, g[i][0]);
    }

    int[] puddles = new int[g.length];
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

    System.out.println(sum(puddles));
    System.out.println(puddles.length + " " + String.join(" ", puddles));
  }

  private static int sum(int[] puddles) {
    int sum = 0;
    for (int puddle : puddles) {
      sum += puddle;
    }
    return sum;
  }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String.join` method to concatenate the elements of the `puddles` array into a string. The `sum` method is used to calculate the sum of the elements in the `puddles` array.</s>
