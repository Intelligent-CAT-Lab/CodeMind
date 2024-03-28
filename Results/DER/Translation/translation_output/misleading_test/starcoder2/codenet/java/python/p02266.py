

```

```

```

python code:

```

```
/p02266.md
# p02266

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
\\//

Expected output:
65
14

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
10

Expected output:
10

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02265 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        
        int n = Integer.parseInt(reader.readLine());
        
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            a[i] = Integer.parseInt(line[0]);
            b[i] = Integer.parseInt(line[1]);
            c[i] = Integer.parseInt(line[2]);
            d[i] = Integer.parseInt(line[3]);
        }
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = a[i] + b[j];
                int count = 0;
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (sum == c[k] + d[l]) {
                            count++;
                        }
                    }
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        
        System.out.println(max);
    }
}

```

python code:

```

```
/p02264.md
# p02264

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02264 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        
        int n = Integer.parseInt(reader.readLine());
        
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            a[i] = Integer.parseInt(line[0]);
            b[i] = Integer.parseInt(line[1]);
            c[i] = Integer.parseInt(line[2]);
            d[i] = Integer.parseInt(line[3]);
        }
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = a[i] + b[j];
                int count = 0;
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (sum == c[k] + d[l]) {
                            count++;
