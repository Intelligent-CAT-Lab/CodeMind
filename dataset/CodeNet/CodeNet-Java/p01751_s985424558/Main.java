import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
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
