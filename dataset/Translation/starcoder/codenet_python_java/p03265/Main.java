import java.util.*;
public class p03265 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=sc.nextInt();
        int d=sc.nextInt();
        int f=sc.nextInt();
        int x3=d-f+s;
        int y3=f+d-a;
        int x4=a-f+s;
        int y4=s+d-a;
        System.out.println(x3+" "+y3+" "+x4+" "+y4);
    }
}