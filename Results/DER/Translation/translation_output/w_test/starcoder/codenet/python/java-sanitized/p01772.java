import java.util.*;
public class p01772 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' &&!flag){
                flag = true;
            }
            if(s.charAt(i)=='Z' && flag){
                ans+="AZ";
                flag = false;
            }
        }
        if(ans.equals(""))
            System.out.println(-1);
        else
            System.out.println(ans);
    }
}