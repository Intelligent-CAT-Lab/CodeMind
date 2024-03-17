<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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
x, y, a, b = [ int ( i ) for i in input ( ). split ( ) ]
c = [ [ i, j ] for i in range ( a, x + 1 ) for j in range ( b, y + 1 ) if i > j ]
print ( len ( c ) ) ; [ print ( * i ) for i in c ]


```

java code:<fim_suffix><fim_middle>

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
        int i = a;
        int j = b;
        int k = 0;
        while(i<=x && j<=y){
            c[k][0] = i;
            c[k][1] = j;
            i++;
            j++;
            k++;
        }
        System.out.println(k);
        for(int[] arr:c){
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
```
<|endoftext|>
