<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
29 27 18 2

Expected output:
2


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
        int ans = 0;
        if(arr[0]==arr[1])
        {
            for(int i=0;i<=arr[2];i++)
            {
                if(arr[0]*i<=arr[2])
                {
                    if(arr[0]*i+arr[2]*(arr[2]/arr[0])==arr[2])
                        ans = Math.max(ans,arr[2]/arr[0]+i);
                }
            }
        }
        else
        {
            for(int i=0;i<=arr[2];i++)
            {
                for(int j=0;j<=arr[1];j++)
                {
                    if(arr[0]*i+arr[1]*j<=arr[2])
                    {
                        if(arr[0]*i+arr[1]*j+arr[2]*(arr[2]/(arr[0]*arr[1]))==arr[2])
                            ans = Math.max(ans,arr[2]/(arr[0]*arr[1])+i+j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
