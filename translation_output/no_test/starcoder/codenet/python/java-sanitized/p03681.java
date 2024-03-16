import java.util.*;
public class p03681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int diff = n-m;
        if(Math.abs(diff)>1)
            System.out.println(0);
        else if(diff==0)
            System.out.println((long)(Math.pow(2,n)*Math.pow(2,m))%1000000007);
        else
            System.out.println((long)(Math.pow(2,n)*Math.pow(2,m-1))%1000000007);
    }
}