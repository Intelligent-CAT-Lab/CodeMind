import java.util.*;
public class p03830 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[1000001];
        for(int i=1;i<=n;i++){
            for(int k:factorization(i)){
                d[k]++;
            }
        }
        int r = 1;
        for(int c:d){
            r *= c+1;
            r %= 1000000007;
        }
        System.out.println(r);
    }
    public static int[] factorization(int n){
        int[] buff = new int[1000001];
        int c = 0;
        while(n%2==0){
            c++;
            n/=2;
        }
        if(c>0) buff[2] = c;
        c = 0;
        while(n%3==0){
            c++;
            n/=3;
        }
        if(c>0) buff[3] = c;
        int x = 5;
        while(n>=x*x){
            c = 0;
            while(n%x==0){
                c++;
                n/=x;
            }
            if(c>0) buff[x] = c;
            if(x%6==5) x+=2;
            else x+=4;
        }
        if(n>1) buff[n] = 1;
        return buff;
    }
}