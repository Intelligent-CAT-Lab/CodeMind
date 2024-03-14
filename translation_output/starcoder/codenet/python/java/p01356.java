<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
def solve():
    n,m,a,b,p,q = map(int,input().split())
    if a==1 and b==1:
        if (p+q)*n <= m:
            return m - (p+q)*n
        else:
            k = m//(p+q)
            return min(m-k*(p+q),(k+1)*(p+q)-m)
    else:
        ans = m
        for i in range(min(n-1,40),-1,-1):
            f = p*(a**i) + q*(b**i)
            if m < f:
                ans = min(ans, f-m)
            else:
                m -= f
            ans = min(ans,m)
        return ans

def main():
    print(solve())

if __name__ == '__main__':
    main()
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        if(a==1 && b==1){
            if((p+q)*n <= m){
                System.out.println(m - (p+q)*n);
            }else{
                int k = m/(p+q);
                System.out.println(Math.min(m-k*(p+q),(k+1)*(p+q)-m));
            }
        }else{
            int ans = m;
            for(int i = Math.min(n-1,40); i >= 0; i--){
                int f = p*(a^i) + q*(b^i);
                if(m < f){
                    ans = Math.min(ans, f-m);
                }else{
                    m -= f;
                }
                ans = Math.min(ans,m);
            }
            System.out.println(ans);
        }
    }
}
```
<|endoftext|>
