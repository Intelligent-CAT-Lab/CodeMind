import java.util.*;
public class p03480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int res = n;
        for(int i = 0;i<n-1;i++){
            if(s.charAt(i)!= s.charAt(i+1)){
                res = Math.min(res,Math.max(n-i-1,i+1));
            }
        }
        if(res == n) System.out.println(n);
        else System.out.println(res);
    }
}