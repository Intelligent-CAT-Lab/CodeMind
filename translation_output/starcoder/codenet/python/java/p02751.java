<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n,m=map(int,input().split())
ans=[["1"]*(2**m-1) for _ in range(2**n-1)]
for k in range(1,11):
    for i in range(2**k,2**n,2**k):
        for j in range(2**k,2**m,2**k):
            if ans[i-1][j-1]=="1":
                ans[i-1][j-1]="0"
            else:
                ans[i-1][j-1]="1"
for i in range(2**n-1):
    print("".join(ans[i]))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String[][] ans=new String[2**n-1][2**m-1];
        for(int k=1;k<=10;k++){
            for(int i=2**k;i<2**n;i+=2**k){
                for(int j=2**k;j<2**m;j+=2**k){
                    if(ans[i-1][j-1].equals("1")){
                        ans[i-1][j-1]="0";
                    }else{
                        ans[i-1][j-1]="1";
                    }
                }
            }
        }
        for(int i=0;i<2**n-1;i++){
            for(int j=0;j<2**m-1;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
```
<|endoftext|>
