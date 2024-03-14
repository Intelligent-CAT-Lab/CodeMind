import java.util.*;
public class p02233 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        int i=0;
        while(i<n){
            a=b;
            b=a+b;
            i++;
        }
        System.out.println(a);
    }
}