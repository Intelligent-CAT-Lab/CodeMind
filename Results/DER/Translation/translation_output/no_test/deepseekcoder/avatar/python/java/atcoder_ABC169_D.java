<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x = int ( input ( ) )
def factorization ( n ) :
    arr = [ ]
    temp = n
    for i in range ( 2 , int ( - ( - n ** 0.5 // 1 ) ) + 1 ) :
        if temp % i == 0 :
            cnt = 0
            while temp % i == 0 :
                cnt += 1
                temp //= i
            arr . append ( [ i , cnt ] )
    if temp != 1 :
        arr . append ( [ temp , 1 ] )
    if arr == [ ] :
        arr . append ( [ n , 1 ] )
    return arr
l = factorization ( x )
l = sorted ( l )
ans = 0
for i in range ( len ( l ) ) :
    if l [ i ] [ 0 ] == 1 :
        continue
    else :
        s = 0
        num = l [ i ] [ 1 ]
        if num == 1 :
            j = 1
        else :
            for j in range ( 1 , num ) :
                s += j
                if s == num :
                    break
                elif s > num :
                    j -= 1
                    break
        ans += j
print ( ans )


```

### Response:
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        ArrayList<int[]> l = factorization(x);
        Collections.sort(l, (a, b) -> a[0] - b[0]);
        int ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[0] == 1)
                continue;
            else {
                int s = 0;
                int num = l.get(i)[1];
                int j;
                if (num == 1)
                    j = 1;
                else {
                    for (j = 1; j < num; j++) {
                        s += j;
                        if (s == num)
                            break;
                        else if (s > num) {
                            j--;
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
    }

    public static ArrayList<int[]> factorization(int n) {
        ArrayList<int[]> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new int[]{i, cnt});
            }
        }
        if (temp != 1)
            arr.add(new int[]{temp, 1});
        if (arr.isEmpty())
            arr.add(new int[]{n, 1});
        return arr;
    }
}
```
<|EOT|>
