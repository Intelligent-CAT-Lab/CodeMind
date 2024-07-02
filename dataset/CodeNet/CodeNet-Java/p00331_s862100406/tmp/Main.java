import java.util.*;

class Main{
    void solve(){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
System.out.println("[INST]5;H;sc.nextInt();"+H);
        int R = sc.nextInt();
System.out.println("[INST]6;R;sc.nextInt();"+R);
        if ( H*(-1) == R ) System.out.println("0");
        else if ( H*(-1) > R ) System.out.println("-1");
        else if ( H*(-1) < R ) System.out.println("1");
    }

    public static void main(String[] args){ new Main().solve(); }
}


