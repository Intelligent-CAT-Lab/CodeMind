import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
      int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
      int c = sc.nextInt();
System.out.println("[INST]6;c;sc.nextInt();"+c);
      if(c<=a+b)System.out.println(b+c);
      else System.out.println(2*b+a+1);
    }
}
