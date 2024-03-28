<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
29 27 18 2

Expected output:
2


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

        int ans = 0;
        if (length % arr[0] == 0) {
            ans = length / arr[0];
        } else if (arr[0] == arr[1]) {
            for (int i = 0; i <= length / arr[2]; i++) {
                int check = length - i * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    ans = Math.max(ans, i + check / arr[0]);
                }
            }
        } else {
            for (int i = 0; i <= length / arr[2]; i++) {
                for (int j = 0; j <= length / arr[1]; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        ans = Math.max(ans, i + j + check / arr[0]);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
```
This code first reads the input from the user, which is the length of the ribbon and the four numbers. It then sorts the array in ascending order and checks if the length of the ribbon is divisible by the first number. If it is, it prints the result and returns.

If the length of the ribbon is not divisible by the first number, it checks if the first two numbers are equal. If they are, it loops through the possible values of i and checks if the length of the ribbon minus i times the second number is divisible by the first number. If it is, it prints the result and returns.

If the first two numbers are not equal, it loops through the possible values of i and j and checks if the length of the ribbon minus i times the second number minus j times the third number is divisible by the first number. If it is, it prints the result and returns.

Finally, it prints the result and returns.</s>
