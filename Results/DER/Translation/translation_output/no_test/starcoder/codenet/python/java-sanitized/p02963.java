import java.util.*;
public class p02963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int X1 = 0, Y1 = 0;
        int tmp = (int)Math.sqrt(S);
        if(tmp*tmp >= S) {
            int X2 = tmp, Y3 = tmp;
        } else {
            int X2 = tmp+1, Y3 = tmp+1;
        }
        int rest = X2*X2 - S;
        if(rest == 0) {
            int X3 = 0, Y2 = 0;
        } else {
            if(rest < 1000000000) {
                int X3 = 1, Y2 = rest;
            } else {
                for(int i = 2; i <= Math.sqrt(rest); i++) {
                    if(rest % i == 0) {
                        int X3 = i, Y2 = rest / i;
                    }
                }
            }
        }
        System.out.println(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
    }
}