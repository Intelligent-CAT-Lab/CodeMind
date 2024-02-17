import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int num1 = Integer.parseInt(str);
    int a = Integer.parseInt(""+str.charAt(0));
    int b = Integer.parseInt(""+str.charAt(1));
    int c = Integer.parseInt(""+str.charAt(2));
    int num2 = 100*c+10*b+a;
    if(num1==num2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}