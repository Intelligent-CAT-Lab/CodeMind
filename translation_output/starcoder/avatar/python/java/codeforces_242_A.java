<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
x, y, a, b = [ int ( i ) for i in input ( ). split ( ) ]
c = [ [ i, j ] for i in range ( a, x + 1 ) for j in range ( b, y + 1 ) if i > j ]
print ( len ( c ) ) ; [ print ( * i ) for i in c ]


```

java code:<fim_suffix><fim_middle>
```
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
        for(int k = 0; k < c.length; k++){
            for(int l = 0; l < c[0].length; l++){
                c[k][l] = i;
                i++;
            }
        }
        System.out.println(c.length);
        for(int k = 0; k < c.length; k++){
            for(int l = 0; l < c[0].length; l++){
                System.out.print(c[k][l]+" ");
            }
            System.out.println();
        }
    }
}
```
<|endoftext|>
