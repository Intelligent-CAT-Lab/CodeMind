import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
System.out.println("[INST]7;cnt;sc.nextInt();"+cnt);
        double power = 1;
        for (int i = 1; i <= cnt; i++) {
            power = (power*i)%(Math.pow(10, 9) + 7);
System.out.println("[INST]10;None;Math.pow(10, 9);"+Math.pow(10, 9));
        }
        System.out.println((int)power);
    }
}