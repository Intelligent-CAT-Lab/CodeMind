import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long A = Long.parseLong(stdIn.next());
        long B = Long.parseLong(stdIn.next());
        long K = Long.parseLong(stdIn.next());
        long n = A - K;
        
        if (A + B <= K) {
            System.out.println("0 ▁ 0");
        } else if (n < 0) {
            System.out.println("0 ▁ " + (A + B - K));
        } else {
            System.out.println(n + " ▁ " + B);
        }
    }
}