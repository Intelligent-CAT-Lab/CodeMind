import java.util.*;
public class p03186 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(c<=a+b+1)
            System.out.println(b+c);
        else
            System.out.println(a+2*b+1);
    }
}