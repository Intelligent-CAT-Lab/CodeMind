import java.util.*;
public class p03242 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String moji = sc.next();
        String ans = "";
        for(int i = 0; i < moji.length(); i++){
            ans += (moji.charAt(i) == '1')? "9" : "1";
        }
        System.out.println(ans);
    }
}