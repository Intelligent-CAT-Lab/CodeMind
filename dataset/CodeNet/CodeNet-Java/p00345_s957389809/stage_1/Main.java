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
        int o, p, l, d;
        o = p = -1;
        String all = "", sub = "";
var newVariable_0 = in.length();        for ( int i = 0; i < newVariable_0; i++ ){
var newVariable_1 = in.charAt(i);            if ( newVariable_1 == '.' ){
                o = i;
var newVariable_2 = in.charAt(i);            } else if ( newVariable_2 == '(' ) {
                p = i;
                sub = all;
var newVariable_3 = in.charAt(i);            } else if ( newVariable_3 == ')' ) {
            } else {
                all += in.charAt(i);
            }
        }
var newVariable_4 = in.length();        d = newVariable_4 - o - 1;
        l = p - o - 1;
        if ( p == -1 ){
var newVariable_5 = Integer.parseInt(all);var newVariable_6 = Math.pow(10, d);            print(Integer.parseInt(all), (int)newVariable_6);
        }else {
            d -= 2; // for ()
var newVariable_7 = Integer.parseInt(all);var newVariable_8 = Integer.parseInt(sub);var newVariable_9 = Math.pow(10, d);var newVariable_10 = Math.pow(10, l);            print(Integer.parseInt(all)- Integer.parseInt(sub), (int)Math.pow(10, d) - (int)newVariable_10 );
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}

