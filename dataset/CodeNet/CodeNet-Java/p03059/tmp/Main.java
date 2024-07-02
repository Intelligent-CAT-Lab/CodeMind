import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]7;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]8;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]9;c;sc.nextInt();"+c);
        int amount = 0;
      	int time = a;  
      
        for(int i = 2; time <= c + 0.5; i++){
            amount += b;
          	time = a * i;
        }
        
        System.out.println(amount);
    }
}