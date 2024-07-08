import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char a = str.charAt(0);
    int b = (int)a;
    char c = (char)(b+1);    
    System.out.println(c);
  }
}
