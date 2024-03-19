<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
29 27 18 2

Expected output:
-41

```
def cutRibbon ( ) :
    arr = [ int ( i ) for i in input ( ) . split ( ) ]
    length = arr [ 0 ]
    arr = sorted ( arr [ 1 : 4 ] , reverse = False )
    if ( length % arr [ 0 ] == 0 ) :
        print ( int ( length / arr [ 0 ] ) )
        return
    ans = 0
    if ( arr [ 0 ] == arr [ 1 ] ) :
        k = 0
        for i in range ( int ( length / arr [ 2 ] ) + 1 ) :
            check = length - i * arr [ 2 ]
            if ( check >= 0 and check % arr [ 0 ] == 0 ) :
                k = int ( check / arr [ 0 ] )
                ans = max ( ans , k + i )
    else :
        k = 0
        for i in range ( int ( length / arr [ 2 ] ) + 1 ) :
            for j in range ( int ( length / arr [ 1 ] ) + 1 ) :
                check = length - i * arr [ 2 ] - j * arr [ 1 ]
                if ( check >= 0 and check % arr [ 0 ] == 0 ) :
                    k = int ( check / arr [ 0 ] )
                    ans = max ( ans , k + i + j )
    print ( ans )
    return
cutRibbon ( )


```
[/INST]
```java
import java.util.Scanner;

public class CutRibbon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int[] sortedArr = new int[4];
        for (int i = 0; i < 4; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);

        int ans = 0;
        if (length % sortedArr[0] == 0) {
            ans = length / sortedArr[0];
        } else {
            if (sortedArr[0] == sortedArr[1]) {
                for (int i = 0; i <= length / sortedArr[2]; i++) {
                    int check = length - i * sortedArr[2];
                    if (check >= 0 && check % sortedArr[0] == 0) {
                        ans = Math.max(ans, i + check / sortedArr[0]);
                    }
                }
            } else {
                for (int i = 0; i <= length / sortedArr[2]; i++) {
                    for (int j = 0; j <= length / sortedArr[1]; j++) {
                        int check = length - i * sortedArr[2] - j * sortedArr[1];
                        if (check >= 0 && check % sortedArr[0] == 0) {
                            ans = Math.max(ans, i + j + check / sortedArr[0]);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
```
This is a Java implementation of the Python code provided. It uses the `Scanner` class to read input from the user, and the `Arrays.sort()` method to sort the input array. The rest of the code is similar to the Python code, with some minor changes to account for the differences in syntax between the two languages.</s>
