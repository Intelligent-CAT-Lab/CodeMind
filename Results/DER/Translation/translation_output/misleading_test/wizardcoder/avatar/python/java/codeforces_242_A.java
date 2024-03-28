Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 3 2

Expected output:
6
4 2
4 3
5 2
5 3
5 4

```
x, y, a, b = [ int ( i ) for i in input ( ). split ( ) ]
c = [ [ i, j ] for i in range ( a, x + 1 ) for j in range ( b, y + 1 ) if i > j ]
print ( len ( c ) ) ; [ print ( * i ) for i in c ]


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] c = new int[x-a+1][y-b+1];
        int count = 0;
        for(int i=a;i<=x;i++){
            for(int j=b;j<=y;j++){
                if(i>j){
                    c[i-a][j-b] = count;
                    count++;
                }
            }
        }
        System.out.println(count);
        for(int i=0;i<x-a+1;i++){
            for(int j=0;j<y-b+1;j++){
                if(c[i][j]!=0){
                    System.out.print(c[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
```<|endoftext|>
