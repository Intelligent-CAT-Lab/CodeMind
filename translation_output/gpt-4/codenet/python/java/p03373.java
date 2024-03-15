Here's the equivalent Java code for the provided Python script:

```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdout = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = stdin.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int x = Integer.parseInt(input[3]);
        int y = Integer.parseInt(input[4]);
        
        int ans = 0;
        if (2 * c <= a + b) {
            int minXY = Math.min(x, y);
            ans += minXY * 2 * c;
            x -= minXY;
            y -= minXY;
            
            if (x > 0 && 2 * c <= a) {
                ans += 2 * c * x;
            } else if (x > 0) {
                ans += a * x;
            } else if (y > 0 && 2 * c <= b) {
                ans += 2 * c * y;
            } else if (y > 0) {
                ans += b * y;
            }
            
        } else {
            ans = x * a + y * b;
        }

        stdout.write(String.valueOf(ans));
        stdout.flush();
        stdout.close();
    }
}
```

In this Java version, I used `BufferedReader` and `BufferedWriter` for input and output respectively, akin to Python's `stdin` and `stdout`. Data reading takes place line by line and then we split the line into individual string components before parsing them to integers. For output, we convert the integer to a string before writing it and then flush the buffer to ensure all data is actually written out. Remember to close the `BufferedWriter` after writing to release system resources.
