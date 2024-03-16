import java.util.*;
public class p01637 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int rd=sc.nextInt();
        int rr=sc.nextInt();
        int cd=sc.nextInt();
        int cr=sc.nextInt();
        int ex=cd*100/rd;
        if(f(ex,rd,cd)){
            ex+=1;
        }
        int ey=cr*100/rr;
        if(f(ey,rr,cr)){
            ey+=1;
        }
        System.out.println(m-ex-ey if m-ex-ey>=0 else -1);
    }
    public static boolean f(int ex,int rd,int cd){
        return ex*rd<100*cd;
    }
}