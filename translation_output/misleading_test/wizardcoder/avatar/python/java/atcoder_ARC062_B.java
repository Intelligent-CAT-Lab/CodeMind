Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
30

```
import sys
input = lambda : sys. stdin. readline ( ). rstrip ( )
sys. setrecursionlimit ( 10 ** 9 )
def pin ( type = int ) : return map ( type, input ( ). split ( ) )
def tupin ( t = int ) : return tuple ( pin ( t ) )
def lispin ( t = int ) : return list ( pin ( t ) )
from collections import Counter
def resolve ( ) :
    S = input ( )
    c = Counter ( S )
    print ( ( c [ " g " ] - c [ " p " ] ) // 2 )
resolve ( )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = 0;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    if (i == 0 && j == 0) {
                        grid[i][j] = 1;
                    } else if (i == 0 && j == m - 1) {
                        grid[i][j] = 2;
                    } else if (i == n - 1 && j == 0) {
                        grid[i][j] = 3;
                    } else if (i == n - 1 && j == m - 1) {
                        grid[i][j] = 4;
                    }
                } else {
                    if (grid[i - 1][j] == 1 && grid[i][j - 1] == 2) {
                        grid[i][j] = 5;
                    } else if (grid[i - 1][j] == 2 && grid[i][j - 1] == 3) {
                        grid[i][j] = 6;
                    } else if (grid[i - 1][j] == 3 && grid[i][j - 1] == 4) {
                        grid[i][j] = 7;
                    } else if (grid[i - 1][j] == 4 && grid[i][j - 1] == 1) {
                        grid[i][j] = 8;
                    } else if (grid[i - 1][j] == 1 && grid[i][j - 1] == 3) {
                        grid[i][j] = 9;
                    } else if (grid[i - 1][j] == 2 && grid[i][j - 1] == 4) {
                        grid[i][j] = 10;
                    } else if (grid[i - 1][j] == 3 && grid[i][j - 1] == 1) {
                        grid[i][j] = 11;
                    } else if (grid[i - 1][j] == 4 && grid[i][j - 1] == 2) {
                        grid[i][j] = 12;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 5 || grid[i][j] == 6 || grid[i][j] == 7 || grid[i][j] == 8) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
```<|endoftext|>
