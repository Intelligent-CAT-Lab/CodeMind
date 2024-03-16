Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<List<Integer>> l = factorization(x);
        l = sorted(l);
        int ans = 0;
        for(int i=0;i<l.size();i++){
            if(l.get(i).get(0)==1){
                continue;
            }else{
                int num = l.get(i).get(1);
                int j=1;
                int s=0;
                for(j=1;j<=num;j++){
                    s+=j;
                    if(s==num){
                        break;
                    }else if(s>num){
                        j--;
                        break;
                    }
                }
                ans+=j;
            }
        }
        System.out.println(ans);
    }
    public static List<List<Integer>> factorization(int n){
        List<List<Integer>> arr = new ArrayList<>();
        int temp = n;
        for(int i=2;i<=Math.sqrt(temp);i++){
            if(temp%i==0){
                int cnt=0;
                while(temp%i==0){
                    cnt++;
                    temp/=i;
                }
                arr.add(Arrays.asList(i,cnt));
            }
        }
        if(temp!=1){
            arr.add(Arrays.asList(temp,1));
        }
        if(arr.isEmpty()){
            arr.add(Arrays.asList(n,1));
        }
        return arr;
    }
    public static List<List<Integer>> sorted(List<List<Integer>> arr){
        Collections.sort(arr, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0)-o2.get(0);
            }
        });
        return arr;
    }
}
```<|endoftext|>
