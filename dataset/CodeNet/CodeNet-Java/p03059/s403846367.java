import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int amount = 0;
      	int time = a;  
      
        for(int i = 2; time <= c + 0.5; i++){
            amount += b;
          	time = a * i;
        }
        
        System.out.println(amount);
    }
}