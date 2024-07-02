import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
           int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
           int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
           int c = sc.nextInt();
System.out.println("[INST]6;c;sc.nextInt();"+c);
           boolean flag = true;
           int y = 0;
           loop:for(int i=0;i<=60;i++) {
        	   int x = i*60+c;
        	   while(x-y>=a+b) y += (a+b);
        	   if(1<=x-y && x-y<=a) {
        		   System.out.println(x);
        		   flag = false;
        		   break loop;
        	   }
           }
           if(flag) System.out.println("-1");          
        }
    }
}
