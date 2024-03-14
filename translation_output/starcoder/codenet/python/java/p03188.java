<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
K=int(input())

if K<=500:
    print(K)
    for i in range(1,K+1):
        print((str(i)+" ")*K)

else:
    KUP=((K+1)//2+3)//4*4
    print(KUP)

    ANS=[[0]*KUP for i in range(KUP)]

    begin=0
    for i in range(KUP):
        for j in range(KUP):
            if i%2==0:
                ANS[i][(j+begin)%KUP]=j+1
            else:
                ANS[i][(j+begin)%KUP]=j+1+KUP
                
        begin+=1

    for i in range(KUP*2-K):

        for j in range(KUP):
            for l in range(KUP):
                if ANS[j][l]==KUP*2-i:
                    ANS[j][l]=KUP*2-i-KUP

    for ans in ANS:
        print(*ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        if(K<=500){
            System.out.println(K);
            for(int i=1;i<=K;i++){
                System.out.print(i+" ");
                for(int j=1;j<=K;j++)
                    System.out.print(j+" ");
                System.out.println();
            }
        }
        else{
            int KUP=((K+1)/2+3)/4*4;
            System.out.println(KUP);
            int[][] ANS=new int[KUP][KUP];
            int begin=0;
            for(int i=0;i<KUP;i++){
                for(int j=0;j<KUP;j++){
                    if(i%2==0)
                        ANS[i][(j+begin)%KUP]=j+1;
                    else
                        ANS[i][(j+begin)%KUP]=j+1+KUP;
                }
                begin+=1;
            }
            for(int i=KUP*2-K;i<KUP*2;i++){
                for(int j=0;j<KUP;j++){
                    for(int l=0;l<KUP;l++){
                        if(ANS[j][l]==KUP*2-i)
                            ANS[j][l]=KUP*2-i-KUP;
                    }
                }
            }
            for(int[] ans:ANS)
                System.out.println(Arrays.toString(ans));
        }
    }
}
```
<|endoftext|>
