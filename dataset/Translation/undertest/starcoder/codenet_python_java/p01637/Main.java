import java.util.*;
public class p01637 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int rd=sc.nextInt();
        int rr=sc.nextInt();
        int cd=sc.nextInt();
        int cr=sc.nextInt();
        int ex=cd*100/rd;
        if(ex*rd<100*cd)ex++;
        int ey=cr*100/rr;
        if(ey*rr<100*cr)ey++;
        System.out.println(m-ex-ey);
    }
}