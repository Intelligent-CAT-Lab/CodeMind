import java.util.*;
public class p03035 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(A>=13)
            System.out.println(B);
        else if(6<=A&&A<=12)
            System.out.println(B/2);
        else
            System.out.println(0);
    }
}