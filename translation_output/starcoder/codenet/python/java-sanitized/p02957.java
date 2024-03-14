import java.util.*;
public class p02957 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=(a*a-b*b)/(2*(a-b));
        if(x%1==0)
            System.out.println(x);
        else
            System.out.println("IMPOSSIBLE");
    }
}