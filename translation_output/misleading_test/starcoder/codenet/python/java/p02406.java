<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
30

Expected output:
3 6 9 12 13 15 18 23 24 27 30

```
n = int(input())
A = list()
for i in range(1,n+1):
    if i % 3 == 0:
        A.append(i)
    elif "3" in str(i):
        A.append(i)
print(" ", end="")
for i in range(len(A)-1):
    print(A[i], end=" ")
print(A[len(A)-1])


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                A.add(i);
            }
            else if(String.valueOf(i).contains("3")){
                A.add(i);
            }
        }
        System.out.print(" ");
        for(int i=0;i<A.size()-1;i++){
            System.out.print(A.get(i)+" ");
        }
        System.out.println(A.get(A.size()-1));
    }
}
```
<|endoftext|>
