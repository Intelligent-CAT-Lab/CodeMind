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
        for ( int i = 0; i < in.length(); i++ ){
            if ( in.charAt(i) == '.' ){
                o = i;
            } else if ( in.charAt(i) == '(' ) {
                p = i;
                sub = all;
            } else if ( in.charAt(i) == ')' ) {
            } else {
                all += in.charAt(i);
            }
        }
        d = in.length() - o - 1;
        l = p - o - 1;
        if ( p == -1 ){
            print(Integer.parseInt(all), (int)Math.pow(10, d));
        }else {
            d -= 2; // for ()
            print(Integer.parseInt(all)- Integer.parseInt(sub), (int)Math.pow(10, d) - (int)Math.pow(10, l) );
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}

