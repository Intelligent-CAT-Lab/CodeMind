import java.util.*;
public class p02879 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        if(0<a && a<10 && 0<b && b<10)
            System.out.println(a*b);
        else
            System.out.println("-1");
    }
}