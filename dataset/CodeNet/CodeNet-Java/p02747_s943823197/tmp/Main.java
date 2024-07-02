import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){ 
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
System.out.println("[INST]5;str;scan.next();"+str);
   
    String last = str.replaceAll("hi", "");
System.out.println("[INST]7;last;str.replaceAll('hi', '');"+last);
    if(last.length() == 0) {
System.out.println("[INST]8;None;last.length();"+last.length());
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
   }
}