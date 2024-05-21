import java.util.*;
import java.io.*;
class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++){
            if(s.charAt(i)!= s.charAt(i+1)){
                res = Math.min(res,Math.max(n-i-1,i+1));
            }
        }
        if(res == Integer.MAX_VALUE){
            System.out.println(n);
        }else{
            System.out.println(res);
        }
    }
    public static void main(String args[]) {
        solve();
    }
}