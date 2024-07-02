import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
    int b = sc.nextInt();
System.out.println("[INST]7;b;sc.nextInt();"+b);
    int c = sc.nextInt();
System.out.println("[INST]8;c;sc.nextInt();"+c);
    int d = sc.nextInt();
System.out.println("[INST]9;d;sc.nextInt();"+d);
    
    while((a>0) && (c>0)){
      a -= d;
      c -= b;
    }
    
    if(c>0){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
  }
}
    