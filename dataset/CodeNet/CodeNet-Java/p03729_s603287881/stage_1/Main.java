
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String A = Input.next();
        String B = Input.next();
        String C = Input.next();
var newVariable_0 = A.charAt(A.length() - 1);var newVariable_1 = A.length();var newVariable_2 = B.charAt(0);var newVariable_3 = B.charAt(B.length() - 1);var newVariable_4 = B.length();var newVariable_5 = C.charAt(0);        if (A.charAt(A.length() - 1) == B.charAt(0) && B.charAt(B.length() - 1) == newVariable_5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");}
    }
}
