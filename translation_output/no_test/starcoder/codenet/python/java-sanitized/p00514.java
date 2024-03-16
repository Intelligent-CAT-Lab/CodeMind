import java.util.*;
public class p00514 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        int a=Math.min(n-1,r-m*n);
        int b=Math.max(n-1,r-m*n);
        int d=1;
        for(int i=0;i<a;i++)d*=i+1;
        int u=1;
        for(int i=b;i<a+b;i++)u*=i+1;
        System.out.println(u/d);
    }
}