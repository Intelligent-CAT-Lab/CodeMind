import java.util.*;
public class p01945 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.indexOf('*');
        int p=Math.abs(s.substring(0,n).replaceAll("[()]"," ").split(" ").length-s.substring(0,n).replaceAll("[()]"," ").split(" ").length);
        int q=Math.abs(s.substring(n+1,s.length()).replaceAll("[()]"," ").split(" ").length-s.substring(n+1,s.length()).replaceAll("[()]"," ").split(" ").length);
        System.out.println(Math.min(p,q));
    }
}