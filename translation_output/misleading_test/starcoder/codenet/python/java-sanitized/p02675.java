import java.util.*;
public class p02675 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%10==3)
            System.out.println("bon");
        else if(n%10==2 || n%10==4 || n%10==5 || n%10==7 || n%10==9)
            System.out.println("hon");
        else
            System.out.println("pon");
    }
}