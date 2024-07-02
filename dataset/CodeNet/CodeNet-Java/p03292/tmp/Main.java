import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
System.out.println("[INST]8;T;sc.nextInt();"+T);
        int R = sc.nextInt();
System.out.println("[INST]9;R;sc.nextInt();"+R);
        int Y = sc.nextInt();
System.out.println("[INST]10;Y;sc.nextInt();"+Y);

        int A = Math.max(Math.max(T,R),Y);
System.out.println("[INST]12;A;Math.max(Math.max(T,R),Y);"+A);
System.out.println("[INST]12;None;Math.max(T,R);"+Math.max(T,R));
        int B = Math.min(Math.min(T,R),Y);
System.out.println("[INST]13;B;Math.min(Math.min(T,R),Y);"+B);
System.out.println("[INST]13;None;Math.min(T,R);"+Math.min(T,R));

        System.out.println(A-B);
    }
}
