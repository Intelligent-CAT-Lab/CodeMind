import java.util.*;

class Main{

    int gcd(int x, int y){
        return y > 0 ? gcd(y, x%y) : x;
    }

    void print(int x, int y){
        int g = gcd(x, y);
        System.out.println(x/g + "/" + y/g);
    }

    void solve(){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
System.out.println("[INST]15;in;sc.next();"+in);
        int o, p, l, d;
        o = p = -1;
        String all = "", sub = "";
        for ( int i = 0; i < in.length(); i++ ){
System.out.println("[INST]19;None;in.length();"+in.length());
            if ( in.charAt(i) == '.' ){
System.out.println("[INST]20;None;in.charAt(i);"+in.charAt(i));
                o = i;
            } else if ( in.charAt(i) == '(' ) {
System.out.println("[INST]22;None;in.charAt(i);"+in.charAt(i));
                p = i;
                sub = all;
            } else if ( in.charAt(i) == ')' ) {
System.out.println("[INST]25;None;in.charAt(i);"+in.charAt(i));
            } else {
                all += in.charAt(i);
System.out.println("[INST]27;all;in.charAt(i);"+all);
            }
        }
        d = in.length() - o - 1;
System.out.println("[INST]30;None;in.length();"+in.length());
        l = p - o - 1;
        if ( p == -1 ){
            print(Integer.parseInt(all), (int)Math.pow(10, d));
System.out.println("[INST]33;None;Integer.parseInt(all);"+Integer.parseInt(all));
System.out.println("[INST]33;None;Math.pow(10, d);"+Math.pow(10, d));
        }else {
            d -= 2; // for ()
            print(Integer.parseInt(all)- Integer.parseInt(sub), (int)Math.pow(10, d) - (int)Math.pow(10, l) );
System.out.println("[INST]36;None;Integer.parseInt(all);"+Integer.parseInt(all));
System.out.println("[INST]36;None;Integer.parseInt(sub);"+Integer.parseInt(sub));
System.out.println("[INST]36;None;Math.pow(10, d);"+Math.pow(10, d));
System.out.println("[INST]36;None;Math.pow(10, l);"+Math.pow(10, l));
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}

