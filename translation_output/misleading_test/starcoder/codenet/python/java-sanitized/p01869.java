import java.util.*;
public class p01869 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&1)!=0)System.out.println(-1);
        else{
            int[] a=new int[n];
            f(a,0,n);
            Arrays.sort(a);
            System.out.println(g(n,0));
        }
    }
    public static void f(int[] a,int bin,int n){
        if(bin>n)return;
        if(bin!=0)a[bin-1]=bin;
        f(a,bin*10+2,n);
        f(a,bin*10+8,n);
    }
    public static int g(int n,int p){
        int m=-1<<20;
        int x=Arrays.binarySearch(a,n);
        if(x!=-1)m=1;
        if(a[p]*a[p]>n)return m;
        if(n%a[p]==0)m=Math.max(m,g(n/a[p],p)+1);
        return Math.max(m,g(n,p+1));
    }
}