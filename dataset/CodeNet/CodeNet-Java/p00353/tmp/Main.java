import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] input = sc.nextLine().split(" ");
System.out.println("[INST]6;input;sc.nextLine().split(' ');"+input);
System.out.println("[INST]6;None;sc.nextLine();"+sc.nextLine());
      int m = Integer.parseInt(input[0]);
System.out.println("[INST]7;m;Integer.parseInt(input[0]);"+m);
      int f = Integer.parseInt(input[1]);
System.out.println("[INST]8;f;Integer.parseInt(input[1]);"+f);
      int b = Integer.parseInt(input[2]);
System.out.println("[INST]9;b;Integer.parseInt(input[2]);"+b);
      
      if(b > m + f) {
         System.out.println("NA"); 
      } else if (b > m){
         System.out.println(b - m);
      } else {
         System.out.println("0");
      }
   }
}
