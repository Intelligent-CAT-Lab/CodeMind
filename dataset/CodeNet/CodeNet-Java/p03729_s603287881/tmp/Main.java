
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String A = Input.next();
System.out.println("[INST]7;A;Input.next();"+A);
        String B = Input.next();
System.out.println("[INST]8;B;Input.next();"+B);
        String C = Input.next();
System.out.println("[INST]9;C;Input.next();"+C);
        if (A.charAt(A.length() - 1) == B.charAt(0) && B.charAt(B.length() - 1) == C.charAt(0)) {
System.out.println("[INST]10;None;A.charAt(A.length() - 1);"+A.charAt(A.length() - 1));
System.out.println("[INST]10;None;A.length();"+A.length());
System.out.println("[INST]10;None;B.charAt(0);"+B.charAt(0));
System.out.println("[INST]10;None;B.charAt(B.length() - 1);"+B.charAt(B.length() - 1));
System.out.println("[INST]10;None;B.length();"+B.length());
System.out.println("[INST]10;None;C.charAt(0);"+C.charAt(0));
            System.out.println("YES");
        } else {
            System.out.println("NO");}
    }
}
