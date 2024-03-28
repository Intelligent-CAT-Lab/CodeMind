import java.util.*;
import java.math.*;

public class p03039 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int ans=0;
        int INF=1000000007;
        if(n<=m){
            int M=-(m-1)*m*(2*m-1)//3+m*m*(m-1);
            int Ms=m*m*(m-1)//2-(m-1)*m*(2*m-1)//6;
            M=M%INF;
            Ms=Ms%INF;
            for(int i=1;i<=n;i++){
                for(int j=i;j<=n;j++){
                    if(i==j){
                        ans=ans+Ms;
                    }
                    else{
                        int d=j-i;
                        ans=ans+d*m*m+M;
                    }
                    ans=ans%INF;
                }
            }
        }
        else{
            int temp=n;
            n=m;
            m=temp;
            int M=-(m-1)*m*(2*m-1)//3+m*m*(m-1);
            int Ms=m*m*(m-1)//2-(m-1)*m*(2*m-1)//6;
            M=M%INF;
            Ms=Ms%INF;
            for(int i=1;i<=n;i++){
                for(int j=i;j<=n;j++){
                    if(i==j){
                        ans=ans+Ms;
                    }
                    else{
                        int d=j-i;
                        ans=ans+d*m*m+M;
                    }
                    ans=ans%INF;
                }
            }
        }
        int fact=1;
        for(int i=n*m-2;i>=n*m-k;i--){
            fact=(fact*i)%INF;
        }
        for(int i=k-2;i>=0;i--){
            fact=(fact*i)%INF;
        }
        ans=(fact*ans)%INF;
        System.out.println(ans);
    }
}