import java.util.*;

public class p02629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String res = "";
        while(N > 0) {
            N -= 1;
            res = (char)(N % 26 + 'a') + res;
            N /= 26;
        }
        System.out.println(res);
    }
}