import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int goal = sc.nextInt();
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
