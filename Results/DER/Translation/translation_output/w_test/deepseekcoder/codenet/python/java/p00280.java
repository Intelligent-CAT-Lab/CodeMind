<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
AABB
ABAB
ABBA
BAAB
BABA
BBAA


```
def dfs(game):
    a,b = game.count("A"),game.count("B")
    if  (a == 5 and b < 4 or a < 4 and b == 5 or a == b == 5 or 
            a == 6 and b == 4 or a == 4 and b == 6):
        possible.add(game)
    elif (max(a,b) <= 4 or a == b == 4 or a == 5 and b == 4 or a == 4 and b == 5):
        possible.add(game)
        if game+"A" not in possible: dfs(game+"A")
        if game+"B" not in possible: dfs(game+"B")
            
j,y = map(int,raw_input().split())
possible = set([])
dfs("")
ans = []
for game in possible:
    if (game.count("A"),game.count("B")) == (j,y): ans.append(game)
print  "\n".join(sorted(ans))
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static Set<String> possible = new HashSet<>();
    static List<String> ans = new ArrayList<>();
    static int j, y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        j = scanner.nextInt();
        y = scanner.nextInt();
        dfs("");
        for (String game : possible) {
            if (countA(game) == j && countB(game) == y) {
                ans.add(game);
            }
        }
        Collections.sort(ans);
        for (String s : ans) {
            System.out.println(s);
        }
    }

    static void dfs(String game) {
        int a = countA(game), b = countB(game);
        if ((a == 5 && b < 4 || a < 4 && b == 5 || a == b && a == 5 ||
                a == 6 && b == 4 || a == 4 && b == 6)) {
            possible.add(game);
        } else if (Math.max(a, b) <= 4 || a == b && a == 4 || a == 5 && b == 4 || a == 4 && b == 5) {
            possible.add(game);
            if (!possible.contains(game + "A")) {
                dfs(game + "A");
            }
            if (!possible.contains(game + "B")) {
                dfs(game + "B");
            }
        }
    }

    static int countA(String game) {
        return (int) game.chars().filter(ch -> ch == 'A').count();
    }

    static int countB(String game) {
        return (int) game.chars().filter(ch -> ch == 'B').count();
    }
}
```

This Java code does the same thing as your Python code. It uses a depth-first search (DFS) to generate all possible strings of "A" and "B" with a length of `j` and `y` respectively. It then filters out the strings that have the correct number of "A"s and "B"s. The result is printed out in lexicographical order.
<|EOT|>
