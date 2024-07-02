import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
    int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
    
    if(a<=5){
      System.out.println(0);
    }
    else if(a<=12){
      System.out.println((int)(b/2));
    }
    else{
      System.out.println(b);
    }
  }
}