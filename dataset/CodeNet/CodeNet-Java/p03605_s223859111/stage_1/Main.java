import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(s.charAt(0) == '9' || s.charAt(1) == '9' ? "Yes" : "No");
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
