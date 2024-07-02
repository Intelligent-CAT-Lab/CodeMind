import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int x=sc.nextInt();
System.out.println("[INST]6;x;sc.nextInt();"+x);
      int a=sc.nextInt();
System.out.println("[INST]7;a;sc.nextInt();"+a);

      if(x<a){
          System.out.println("0");
      }
      else{
        System.out.println("10");
      }

    }
}
