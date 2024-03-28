<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
432

Expected output:
401

```
n=int(input())

dic={}
for i in range(1,50001):
    p=int(i*1.08)
    dic[p]=i
if n in dic:
    print(dic[n])
else:
    print(":(")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[50001];
        for(int i=1;i<=50000;i++){
            arr[i]=i*1.08;
        }
        for(int i=1;i<=50000;i++){
            if(arr[i]==n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }
}
```
'''
<|endoftext|>
