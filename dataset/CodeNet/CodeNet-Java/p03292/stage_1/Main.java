import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = sc.nextInt();
        int Y = sc.nextInt();

var newVariable_0 = Math.max(T,R);        int A = Math.max(newVariable_0,Y);
var newVariable_1 = Math.min(T,R);        int B = Math.min(newVariable_1,Y);

        System.out.println(A-B);
    }
}
