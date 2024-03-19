import java.util.*;
public class p02570 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        if(n/m<=x)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}