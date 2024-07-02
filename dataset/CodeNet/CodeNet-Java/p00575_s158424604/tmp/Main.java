import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
        int goal = sc.nextInt();
System.out.println("[INST]7;goal;sc.nextInt();"+goal);
        int day = 1;
        int coin = 0;
        
        while(coin < goal){
            coin += a;
            if(day % 7 == 0)
                coin += b;
            day++;
        }
        System.out.println(day-1);
    }
}
