import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){ 
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
   
    String last = str.replaceAll("hi", "");
    if(last.length() == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
   }
}