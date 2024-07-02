import java.util.*;
class Main{
    void solve(){
        int A, B, X, ans;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
System.out.println("[INST]5;A;sc.nextInt();"+A);
        B = sc.nextInt();
System.out.println("[INST]6;B;sc.nextInt();"+B);
        X = sc.nextInt();
System.out.println("[INST]7;X;sc.nextInt();"+X);

        if ( X % 500 != 0 ) X += 500 - X%500;
        int a = 0;
        int b = 0;

        if ( A < B ) {
            a = X/1000 + ((X%1000>0)?1:0);
        } else if ( A > 2*B ){
            b = X/500;
        } else {
            a = X/1000; X %= 1000;
            b = X/500;
        }

        System.out.println(A*a + B*b);
    }

    public static void main(String[] args){ new Main().solve(); }
}

