import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = str.length();
    char h = str.charAt(0);
    char t = str.charAt(n-1);
    System.out.println(h+""+(n-2)+""+t);
  }
}