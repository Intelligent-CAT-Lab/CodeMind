<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
def cutRibbon ( ) :
    arr = [ int ( i ) for i in input ( ). split ( ) ]
    length = arr [ 0 ]
    arr = sorted ( arr [ 1 : 4 ], reverse = False )
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
                ans = max ( ans, k + i )
    else :
        k = 0
        for i in range ( int ( length / arr [ 2 ] ) + 1 ) :
            for j in range ( int ( length / arr [ 1 ] ) + 1 ) :
                check = length - i * arr [ 2 ] - j * arr [ 1 ]
                if ( check >= 0 and check % arr [ 0 ] == 0 ) :
                    k = int ( check / arr [ 0 ] )
                    ans = max ( ans, k + i + j )
    print ( ans )
    return
cutRibbon ( )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0;i<4;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int length = arr[0];
        int ans = 0;
        if(arr[0]==arr[1]) {
            for(int i=0;i<=length/arr[2];i++) {
                int check = length - i*arr[2];
                if(check>=0 && check%arr[0]==0) {
                    int k = check/arr[0];
                    ans = Math.max(ans, k+i);
                }
            }
        }
        else {
            for(int i=0;i<=length/arr[2];i++) {
                for(int j=0;j<=length/arr[1];j++) {
                    int check = length - i*arr[2] - j*arr[1];
                    if(check>=0 && check%arr[0]==0) {
                        int k = check/arr[0];
                        ans = Math.max(ans, k+i+j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
