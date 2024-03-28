import java.util.*;
public class p03965 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.length()/2-s.replaceAll("p","").length());
    }
}