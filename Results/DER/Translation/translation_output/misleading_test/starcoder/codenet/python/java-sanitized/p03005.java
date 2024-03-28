import java.util.*;
public class p03005 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        if(K==1)
            System.out.println(0);
        else
            System.out.println(N-K);
    }
}