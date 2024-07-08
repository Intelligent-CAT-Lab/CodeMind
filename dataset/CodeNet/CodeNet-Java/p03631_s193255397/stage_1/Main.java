import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int num1 = Integer.parseInt(str);
var newVariable_0 = str.charAt(0);    int a = Integer.parseInt(""+newVariable_0);
var newVariable_1 = str.charAt(1);    int b = Integer.parseInt(""+newVariable_1);
var newVariable_2 = str.charAt(2);    int c = Integer.parseInt(""+newVariable_2);
    int num2 = 100*c+10*b+a;
    if(num1==num2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}