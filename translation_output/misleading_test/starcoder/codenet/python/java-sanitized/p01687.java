import java.util.*;
public class p01687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() < 8)
            System.out.println(s);
        else{
            String ans = "";
            int l = s.length();
            int i = 0;
            while(i < l){
                if(i <= l - 8 && sorted(s.substring(i, i+8)).equals("AADINNUY"))
                    ans += "AIZUNYAN";
                else
                    ans += s.charAt(i);
                i++;
            }
            System.out.println(ans);
        }
    }
}