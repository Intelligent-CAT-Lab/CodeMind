import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
System.out.println("[INST]5;str;sc.nextLine();"+str);
    int num1 = Integer.parseInt(str);
System.out.println("[INST]6;num1;Integer.parseInt(str);"+num1);
    int a = Integer.parseInt(""+str.charAt(0));
System.out.println("[INST]7;a;Integer.parseInt(''+str.charAt(0));"+a);
System.out.println("[INST]7;None;str.charAt(0);"+str.charAt(0));
    int b = Integer.parseInt(""+str.charAt(1));
System.out.println("[INST]8;b;Integer.parseInt(''+str.charAt(1));"+b);
System.out.println("[INST]8;None;str.charAt(1);"+str.charAt(1));
    int c = Integer.parseInt(""+str.charAt(2));
System.out.println("[INST]9;c;Integer.parseInt(''+str.charAt(2));"+c);
System.out.println("[INST]9;None;str.charAt(2);"+str.charAt(2));
    int num2 = 100*c+10*b+a;
    if(num1==num2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}