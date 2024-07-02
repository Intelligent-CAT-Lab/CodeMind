import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
      int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
      int c = sc.nextInt();
System.out.println("[INST]6;c;sc.nextInt();"+c);

      if(a== 5 && b == 7 && c ==5){
      	System.out.println("YES");
      }else if(a== 5 && b== 5 &&c ==7){
      	System.out.println("YES");
      }else if(a == 7 && b == 5&& c ==5){
      	System.out.println("YES");
      }else{
      	System.out.println("NO");
      }
    }
}