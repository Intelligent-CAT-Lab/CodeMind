import java.util.*;
public class p03211 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=99999;
        for(int i=0;i<s.length()-2;i++){
            a=Math.min(Math.abs(753-Integer.parseInt(s.substring(i,i+3))),a);
        }
        System.out.println(a);
    }
}