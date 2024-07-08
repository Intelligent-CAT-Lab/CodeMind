import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    static final int INF = Integer.MAX_VALUE;

    static int[] mh = {0, 1, 0, -1};
    static int[] mw = {1, 0, -1, 0};
    
    public static void main(String[] args) {
        int N = ni();
        
        int count = 0;
        for (int i = 6; i <= 55555; i+=5) {
            if (isPrime(i)) {
                so.print(i + " ");
                count++;
            }
            if (count == N)
                break;
        }
    } 
    
    static boolean isPrime(int n) {
var newVariable_0 = Math.sqrt(n);        for (int i = 2; i <= newVariable_0; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int ni() {
var newVariable_1 = sc.nextInt();        return newVariable_1;
    }
    
    static long nl() {
var newVariable_2 = sc.nextLong();        return newVariable_2;
    }

    static char[] nsToChars() {
var newVariable_3 = sc.next().toCharArray();var newVariable_4 = sc.next();        return newVariable_4.toCharArray();
    }
}
