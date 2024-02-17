
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String A = Input.next();
        String B = Input.next();
        String C = Input.next();
        if (A.charAt(A.length() - 1) == B.charAt(0) && B.charAt(B.length() - 1) == C.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");}
    }
}
