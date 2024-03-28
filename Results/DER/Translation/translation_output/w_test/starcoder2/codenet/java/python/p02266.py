

```

```

```

python code:

```

```/p02266.md
# p02266

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
\\//

Expected output:
4
1 4


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class p02266 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        
        String profile = reader.readLine();
        
        Stack<Integer> stackDown = new Stack<Integer>();
        Stack<Integer> stackArea = new Stack<Integer>();
        Stack<Integer> stackEdge = new Stack<Integer>();
        int totalArea = 0;
        int pos = 0;
        int lv = 0;
        
        for (char c : profile.toCharArray()) {
            if (c == '\\') {
                lv--;
                stackDown.push(pos);
            } else if (c == '/') {
                lv++;
                if (!stackDown.empty()) {
                    int start = stackDown.pop();
                    int tempArea = pos - start;
                    totalArea += tempArea;
                    if (stackArea.empty()) {
                        stackArea.push(tempArea);
                        stackEdge.push(lv);
                    } else {
                        int lastArea = 0;
                        while (!stackEdge.empty() && stackEdge.peek() < lv) {
                            lastArea += stackArea.pop();
                            stackEdge.pop();
                        }
                        stackArea.push(lastArea + tempArea);
                        stackEdge.push(lv);
                    }
                } else {
                    if (!stackArea.empty()) {
                        stackEdge.pop();
                        stackEdge.push(lv);
                    }
                }
            }
            pos++;
        }

        System.out.println(totalArea);
        System.out.print(stackArea.size());
        if (stackArea.size() != 0) {
            System.out.print(" ");
        }
        Iterator<Integer> itr = stackArea.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
            if (itr.hasNext()) {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
/p02265.md
# p02265

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
100


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02265 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            input = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = matrix[i][j];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + matrix[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + matrix[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
                }
            }
        }
        
        System.out.println(dp[n - 1][m - 1]);
    }
}


```

python code:

```

```/p02264.md
# p02264

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
100


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02264 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        
        String[] in        }
        }
        
        System.out.println(dp[n - 1][m - 1]);
    }
}


```

python code:

```

```put = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            input = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
