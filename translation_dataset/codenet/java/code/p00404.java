import java.util.*;

class p00404{

    long search(long x, long y){
        long x_min = 0;
        long y_min = 0;
        long x_max = 0;
        long y_max = 0;
        long f, f1 = 1, f2 = 0;
        long p;
        for (p = 0;; p++){
            if ( x_min <= x && x <= x_max &&
                 y_min <= y && y <= y_max  ) return p%3 + 1;
            f = f1 + f2;
            if ( p % 4 == 0 )  x_max += f; // east
            else if ( p % 4 == 1 ) y_max += f; // north
            else if ( p % 4 == 2 ) x_min -= f; // west
            else  y_min -= f; // south
            f2 = f1;
            f1 = f;
        }
    }

    void solve(){
        long x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextLong();
        y = sc.nextLong();
        System.out.println(search(x, y));
    }

    public static void main(String[] args){
        new p00404().solve();
    }
}


