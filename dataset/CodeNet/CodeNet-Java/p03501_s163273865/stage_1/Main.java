import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,A,B,pp;
        N=sc.nextInt();
        A=sc.nextInt();
        B=sc.nextInt();
        pp=N*A;

        if(pp>B) System.out.println(B);
        else System.out.println(pp);
    }
}
