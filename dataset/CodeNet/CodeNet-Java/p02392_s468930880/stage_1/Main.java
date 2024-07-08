import java.util.Scanner;
public class Main{

    int a,b,c;

    public void input(){
	Scanner scan = new Scanner(System.in);
	a = scan.nextInt();
        b = scan.nextInt();
	c = scan.nextInt(); 
        
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
  