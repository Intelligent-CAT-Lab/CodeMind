import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int H =sc.nextInt();
      int A =sc.nextInt();
      
      int a =H/A;
      int b =a+1;
      
      if(H%A==0){
      System.out.println(a);
      }
      else if(H%A!=0){
      System.out.println(b);
      }   
    }
}