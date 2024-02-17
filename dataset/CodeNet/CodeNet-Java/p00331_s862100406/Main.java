import java.util.*;

class Main{
    void solve(){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int R = sc.nextInt();
        if ( H*(-1) == R ) System.out.println("0");
        else if ( H*(-1) > R ) System.out.println("-1");
        else if ( H*(-1) < R ) System.out.println("1");
    }

    public static void main(String[] args){ new Main().solve(); }
}


