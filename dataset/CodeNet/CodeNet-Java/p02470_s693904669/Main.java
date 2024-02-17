import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ans=1,cnt;
        for(int i=2;i<=n;i++){
            cnt=0;
            while(n%i==0){
                cnt++;
                n/=i;
            }
            if(cnt>0) ans*=(int)(Math.pow(i,cnt)-Math.pow(i,cnt-1));
        }
        System.out.println(ans);
    }
}
