import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
System.out.println("[INST]5;str;sc.nextLine();"+str);
    int n = str.length();
System.out.println("[INST]6;n;str.length();"+n);
    char h = str.charAt(0);
System.out.println("[INST]7;h;str.charAt(0);"+h);
    char t = str.charAt(n-1);
System.out.println("[INST]8;t;str.charAt(n-1);"+t);
    System.out.println(h+""+(n-2)+""+t);
  }
}