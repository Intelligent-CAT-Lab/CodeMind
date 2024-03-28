<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
3 3
##.
..#
#.#


```
A,B = map(int,input().split())
X = []
for i in range(100):
    defC = "." if i<50 else "#"
    line = [defC for _ in range(100)]
    X.append(line)

h,w = (B-1)//50,(B-1)%50
for i in range(h):
    for j in range(50):
        X[i*2][j*2] = "#"
for i in range(w):
    X[h*2][i*2] = "#"

h,w = (A-1)//50,(A-1)%50
for i in range(h):
    for j in range(50):
        X[i*2+51][j*2] = "."
for i in range(w):
    X[h*2+51][i*2] = "."

print(100,100)
for i in range(100):
    print("".join(X[i]))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[][] X = new int[100][100];

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                X[i][j] = (i < 50 && j < 50) ? 0 : 1;
            }
        }

        int h = (B - 1) / 50;
        int w = (B - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2][j * 2] = 1;
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2][i * 2] = 1;
        }

        int h2 = (A - 1) / 50;
        int w2 = (A - 1) % 50;
        for (int i = 0; i < h2; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2 + 51][j * 2] = 0;
            }
        }
        for (int i = 0; i < w2; i++) {
            X[h2 * 2 + 51][i * 2] = 0;
        }

        System.out.println(100 + " " + 100);
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(X[i][j] == 0 ? "." : "#");
            }
            System.out.println();
        }
    }
}
```
This code first initializes a 2D array `X` with all elements set to 0, except for the first 50 rows and columns, which are set to 1.

Then, it calculates the number of rows and columns that need to be filled with 1s for the second rectangle, based on the input values `A` and `B`.

It then fills the rows and columns of the second rectangle with 1s, and the rows and columns of the first rectangle with 0s.

Finally, it prints the resulting 2D array `X` with the correct dimensions and values.</s>
