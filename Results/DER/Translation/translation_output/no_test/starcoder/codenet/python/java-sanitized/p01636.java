import java.util.*;
public class p01636 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int ans = 0;
        for(int i = 1; i < a.length(); i++){
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if(sm.charAt(0) == '0')continue;
            df = Integer.toString(Integer.parseInt(df));
            sm = Integer.toString(Integer.parseInt(sm));
            if((Integer.parseInt(df) + Integer.parseInt(sm)) % 2 == 0 && Integer.parseInt(sm) >= Integer.parseInt(df) && (Integer.parseInt(sm) - Integer.parseInt(df)) % 2 == 0)ans++;
        }
        if(Integer.parseInt(a) % 2 == 0)ans++;
        System.out.println(ans);
    }
}