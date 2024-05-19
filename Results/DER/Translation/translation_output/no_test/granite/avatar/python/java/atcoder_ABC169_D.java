System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
x = int ( input ( ) )
def factorization ( n ) :
    arr = [ ]
    temp = n
    for i in range ( 2, int ( - ( - n ** 0.5 // 1 ) ) + 1 ) :
        if temp % i == 0 :
            cnt = 0
            while temp % i == 0 :
                cnt += 1
                temp //= i
            arr. append ( [ i, cnt ] )
    if temp!= 1 :
        arr. append ( [ temp, 1 ] )
    if arr == [ ] :
        arr. append ( [ n, 1 ] )
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
            for j in range ( 1, num ) :
                s += j
                if s == num :
                    break
                elif s > num :
                    j -= 1
                    break
        ans += j
print ( ans )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<List<Integer>> l = factorization(x);
        l = sorted(l);
        int ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).get(0) == 1) {
                continue;
            } else {
                int s = 0;
                int num = l.get(i).get(1);
                int j = 1;
                if (num == 1) {
                    j = 1;
                } else {
                    for (j = 1; j < num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j -= 1;
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> factorization(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt += 1;
                    temp /= i;
                }
                arr.add(Arrays.asList(i, cnt));
            }
        }
        if (temp!= 1) {
            arr.add(Arrays.asList(temp, 1));
        }
        if (arr.size() == 0) {
            arr.add(Arrays.asList(n, 1));
        }
        return arr;
    }

    public static List<List<Integer>> sorted(List<List<Integer>> l) {
        l.sort(Comparator.comparing(List::get, Comparator.naturalOrder()));
        return l;
    }
}
```<|endoftext|>
