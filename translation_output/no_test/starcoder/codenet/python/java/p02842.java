<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[50001];
        for(int i=1;i<=50000;i++){
            arr[i]=i*1.08;
        }
        if(arr[n]!=0){
            System.out.println(arr[n]);
        }else{
            System.out.println(":(");
        }
    }
}
```
<|endoftext|>
