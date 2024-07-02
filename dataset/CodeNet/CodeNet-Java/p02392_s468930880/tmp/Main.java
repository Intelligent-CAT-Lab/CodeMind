import java.util.Scanner;
public class Main{

    int a,b,c;

    public void input(){
	Scanner scan = new Scanner(System.in);
	a = scan.nextInt();
System.out.println("[INST]7;a;scan.nextInt();"+a);
        b = scan.nextInt();
System.out.println("[INST]8;b;scan.nextInt();"+b);
	c = scan.nextInt(); 
System.out.println("[INST]9;c;scan.nextInt();"+c);
        
    }
 


    public void output(){
	if(a < b && b < c){
         
	    System.out.println("Yes");
        }else{
	    System.out.println("No");
	}

      
    }
 public static void main(String[] args){
     Main p = new Main();
     p.input();
     p.output();
 }
}
  