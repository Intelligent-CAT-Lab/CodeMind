import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double power = 1;
        for (int i = 1; i <= cnt; i++) {
var newVariable_0 = Math.pow(10, 9);            power = (power*i)%(newVariable_0 + 7);
        }
        System.out.println((int)power);
    }
}