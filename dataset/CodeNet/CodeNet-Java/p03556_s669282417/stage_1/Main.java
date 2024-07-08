import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();        int n = Integer.parseInt(newVariable_0);
        
        while (true) {
var newVariable_1 = Math.sqrt(n);var newVariable_2 = Math.sqrt(n);            if ((int)newVariable_2 * (int)newVariable_2 == n) {
                System.out.println(n);
                return;
            }
            n--;
        }
    }
}
