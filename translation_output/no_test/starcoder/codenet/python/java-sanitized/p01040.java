import java.util.*;
public class p01040 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int y1,m1,d1,y2,m2,d2;
        y1=sc.nextInt();
        m1=sc.nextInt();
        d1=sc.nextInt();
        y2=sc.nextInt();
        m2=sc.nextInt();
        d2=sc.nextInt();
        int a=0;
        for(int i=y1;i<=y2;i++){
            if(i%400==0)a+=1;
            else if(i%100==0)a+=0;
            else if(i%4==0)a+=1;
        }
        int[] month={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<m1-1;i++)a+=month[i];
        if(m1==2&&y1%400==0||m1==2&&y1%4==0&&y1%100!=0)a+=1;
        a+=d1-1;
        for(int i=m1;i<m2;i++)a+=month[i-1];
        a+=d2;
        System.out.println(a);
    }
}