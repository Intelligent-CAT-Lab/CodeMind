import java.util.*;
public class p03592 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int o=0,x=0;
        for(int i=0;i<=n/2;i++){
            o=i*m+(n-i)*m;
            x=n*m-o;
            if(o==k || x==k){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}