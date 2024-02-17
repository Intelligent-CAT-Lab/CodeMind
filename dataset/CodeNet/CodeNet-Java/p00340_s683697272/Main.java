import java.util.*;

class Main{
    void solve(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if ( a == b && c == d ||
             a == c && b == d ||
             a == d && b == c ) System.out.println("yes");
        else System.out.println("no");
    }

    public static void main(String[] args){ new Main().solve(); }
}


