import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
System.out.println("[INST]5;str;sc.next();"+str);
    char a = str.charAt(0);
System.out.println("[INST]6;a;str.charAt(0);"+a);
    int b = (int)a;
    char c = (char)(b+1);    
    System.out.println(c);
  }
}
