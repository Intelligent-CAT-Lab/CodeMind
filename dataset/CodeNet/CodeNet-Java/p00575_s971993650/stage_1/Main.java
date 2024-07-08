import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
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
