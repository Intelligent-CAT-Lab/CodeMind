import java.util.*;
public class p03196 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int ans=1;
        int[] arr=new int[n];
        int temp=p;
        for(int i=2;i<=Math.sqrt(p);i++){
            int cnt=0;
            while(temp%i==0){
                cnt++;
                temp/=i;
            }
            if(cnt>0)
                arr[cnt-1]=i;
        }
        if(temp!=1)
            arr[n-1]=temp;
        for(int i=0;i<n;i++){
            ans*=arr[i];
        }
        System.out.println(ans);
    }
}