<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 3 2

Expected output:
6
3 2
4 2
4 3
5 2
5 3
5 4


```
x , y , a , b = [ int ( i ) for i in input ( ) . split ( ) ]
c = [ [ i , j ] for i in range ( a , x + 1 ) for j in range ( b , y + 1 ) if i > j ]
print ( len ( c ) ) ; [ print ( * i ) for i in c ]


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int[][] c = new int[x - a + 1][y - b + 1];
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    c[i - a][j - b] = 1;
                }
            }
        }

        System.out.println(c.length);
        for (int[] row : c) {
            for (int element : row) {
                if (element == 1) {
                    System.out.print(element + " ");
                }
            }
            System.out.println();
        }
    }
}
```
This code first reads the input from the user and stores it in the `input` array. It then initializes the `c` array with the dimensions `x - a + 1` and `y - b + 1`.

The code then iterates over the `c` array and checks if the current element is greater than the corresponding element in the `a` and `b` arrays. If it is, it sets the element in the `c` array to 1.

Finally, the code prints the length of the `c` array and the elements of the `c` array that are greater than 0.</s>
