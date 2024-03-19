import java.util.*;
public class p03697 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        System.out.println(a+b);
        if(a+b>=10)
            System.out.println("error");
    }
}