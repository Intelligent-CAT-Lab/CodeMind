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
var newVariable_0 = Math.pow(i,cnt);var newVariable_1 = Math.pow(i,cnt-1);            if(cnt>0) ans*=(int)(Math.pow(i,cnt)-newVariable_1);
        }
        System.out.println(ans);
    }
}
