import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]7;c;sc.nextInt();"+c);
        int day = 0;
        int coins = 0;
        while (coins < c) {
            day++;
            coins += a;
            if(day%7 == 0) {
                coins += b;
            }
        }
        System.out.println(day);
    }
}
