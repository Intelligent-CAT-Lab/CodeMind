import java.util.*;
public class p03967 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ret=0;
        for(int i=0;i<s.length();i++){
            ret+=(i%2)-[0,1][s.charAt(i)=='p'];
        }
        System.out.println(ret);
    }
}