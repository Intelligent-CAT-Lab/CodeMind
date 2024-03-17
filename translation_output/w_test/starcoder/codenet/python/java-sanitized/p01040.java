import java.util.*;
public class p01040 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y1=sc.nextInt();
        int m1=sc.nextInt();
        int d1=sc.nextInt();
        int y2=sc.nextInt();
        int m2=sc.nextInt();
        int d2=sc.nextInt();
        int a=0;
        for(int i=y1;i<=y2;i++){
            if(i%400==0)a+=1;
            else if(i%100==0)a+=0;
            else if(i%4==0)a+=1;
        }
        Calendar c=Calendar.getInstance();
        c.set(y1,m1,d1);
        while(c.get(Calendar.YEAR)<=y2&&c.get(Calendar.MONTH)<=m2&&c.get(Calendar.DATE)<=d2){
            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY&&c.get(Calendar.DATE)==13)a+=1;
            c.add(Calendar.DATE,1);
        }
        System.out.println(a);
    }
}